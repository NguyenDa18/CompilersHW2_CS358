package gen;

import java.io.File;

public class GenMJGrammar {

	private static final String dir = "src/parse";
	private static final String targetFileName = "MJGrammarParseTable.java";

	public static void main(String[] args) {
		
		// the parse-table file we'll generate to
		File target = new File (dir+"/"+targetFileName);
		
		// the temporary file we'll rename the old version of the generated file
		File temp = new File("temp.txt");
		
		// if the target already exists, rename it
		boolean targetExisted = target.exists();
		if (targetExisted) {
			target.renameTo(temp);
		}
		
		try {
			wrangLR.generator.main.Main.main(new String[] {
					"MJGrammar.java",
//					"-n",
					"-d", dir,
					"-o", targetFileName,
			});
		}
		catch (Exception x) {
			System.out.println("Exception occurred.");
		}
		
		if (targetExisted) {
			// if the target had existed, but the generation was successful, delete
			// the temporary file; otherwise, delete the generated file (if it exists),
			// and rename the temporary file back to its old name
			if (target.exists() && target.length() > 0) {
				temp.delete();
			}
			else {
				target.delete();
				temp.renameTo(target);
			}
		}

	}
}
