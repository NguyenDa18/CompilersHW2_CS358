package parse;
import java.util.ArrayList;
import java.util.List;
import errorMsg.*;
import syntaxtree.*;

public class MJGrammar
		implements wrangLR.runtime.MessageObject, wrangLR.runtime.FilePosObject {
	
	public static final boolean FILTER_GRAMMAR = true;
	
	// constructor
	public MJGrammar(ErrorMsg em) {
		errorMsg = em;
		topObject = null;
	}
	
	// error message object
	private ErrorMsg errorMsg;
	
	// object to be returned by the parser
	private Program topObject;

	// method for printing error message
	public void error(int pos, String msg) {
		errorMsg.error(pos, msg);
	}

	// method for printing warning message
	public void warning(int pos, String msg) {
		errorMsg.warning(pos, msg);
	}

	// method for converting file position to line/char position
	public String filePosString(int pos) {
		return errorMsg.lineAndChar(pos);
	}
	
	// method that registers a newline
	public void registerNewline(int pos) {
		errorMsg.newline(pos-1);
	}

	// returns the object produced by the parse
	public Program parseResult() {
		return topObject;
	}
	
	//===============================================================
	// start symbol
	//===============================================================

	//: <start> ::= ws* <program> =>   
	public void topLevel(Program obj) {
		topObject = obj;
	}
	
	//================================================================
	// top-level program constructs
	//================================================================

	//: <program> ::= # <class decl>+ =>
	public Program createProgram(int pos, List<ClassDecl> vec) {
		return new Program(pos, new ClassDeclList(vec));
	}

	/** ==========================================================================
	// DECLS
	============================================================================== */

	//: <class decl> ::= `class # ID `{ <decl in class>* `} =>
	public ClassDecl createClassDecl(int pos, String name, List<Decl> vec) {
		return new ClassDecl(pos, name, "Object", new DeclList(vec));
	}

	//: <class decl> ::= `class # ID `extends ID `{ <decl in class>* `} =>
	public ClassDecl createdExtendsClassDecl(int pos, String subClassName, String superClassName, List<Decl> decls) {
		return new ClassDecl(pos, subClassName, superClassName, new DeclList(decls));
	}

	//: <decl in class> ::= <method decl> => pass
	//: <decl in class> ::= <inst var decl> => pass

	// //: <method decl> ::= `public `void # ID <formalList> `{ <stmt>* `} =>
	// public Decl createMethodDeclVoid(int pos, String name, VarDeclList formalList, List<Statement> stmts) {
	// 	return new MethodDeclVoid(pos, name, formalList,
	// 			new StatementList(stmts));
	// }

	//: <method decl> ::= `public `void # ID `( `) `{ <stmt>* `} =>
	public Decl createMethodDeclVoid(int pos, String name, List<Statement> stmts) {
		return new MethodDeclVoid(pos, name, new VarDeclList(new VarDeclList()),
				new StatementList(stmts));
	}

	// //: <method decl> ::= `public <type> # ID <formalList> `{ <stmt>* <returnStmt> `} =>
	// public Decl createMethodDeclNonVoid(Type t, int pos, String name, VarDeclList formalList, List<Statement> stmts, Exp returnStmt) {
	// 	return new MethodDeclNonVoid(pos, t, name, formalList,
	// 			new StatementList(stmts), returnStmt);
	// }

	//: <returnStmt> ::= `return <exp> `; => pass

	//: <formalList> ::= `( <type> # ID <listElement>* `) =>
	public VarDeclList createVarDeclList(Type first, int pos, String name, List<VarDecl> elements) {
		elements.add(new InstVarDecl(pos, first, name));
		return new VarDeclList(elements);
	}

	//: <formalList> ::= `( `) =>
	public VarDeclList createEmptyVarDeclList() {
		return new VarDeclList(new VarDeclList());
	}

	//: <listElement> ::= `, <type> # ID =>
	public VarDecl createListVarDecl(Type t, int pos, String name) {
		return new InstVarDecl(pos, t, name);
	}

	/** ==========================================================================
	// TYPES
	============================================================================== */

	//: <type> ::= # `int =>
	public Type intType(int pos) {
		return new IntegerType(pos);
	}

	//: <type> ::= # `boolean =>
	public Type booleanType(int pos) {
		return new BooleanType(pos);
	}

	//: <type> ::= # `void =>
	public Type voidType(int pos) {
		return new VoidType(pos);
	}

	//: <type> ::= # `null =>
	public Type nullType(int pos) {
		return new NullType(pos);
	}

	//: <type> ::= # ID =>
	public Type identifierType(int pos, String name) {
		return new IdentifierType(pos, name);
	}

	//: <type> ::= # <type> <empty bracket pair> =>
	public Type newArrayType(int pos, Type t, Object dummy) {
		return new ArrayType(pos, t);
	}

	//: <empty bracket pair> ::= `[ `] => null

	/** ==========================================================================
	// STATEMENT - LEVEL CONSTRUCTS
	============================================================================== */
	//: <stmt> ::= # `{ <stmt>* `} =>
	public Statement newBlock(int pos, List<Statement> sl) {
		return new Block(pos, new StatementList(sl));
	}

	//: <stmt> ::= <assign> `; => pass

	//: <stmt> ::= <local var decl> `; => pass

	//: <stmt> ::= # `if `( <exp> `) <stmt> # !`else =>
	public Statement newIfOnlyBlock(int pos, Exp exp, Statement body, int elsePos) {
		return new If(pos, exp, body, new Block(elsePos, new StatementList()));
	}

	//: <stmt> ::= # `if `( <exp> `) <stmt> # `else <stmt> =>
	public Statement newIfElseBlock(int ifPos, Exp exp, Statement ifBody, int elsePos, Statement elseBody) {
		return new If(ifPos, exp, ifBody, elseBody);
	}

	//: <stmt> ::= # `for `( <assign> `; <exp> `; <assign> `) <stmt> =>
	public Statement newForLoop(int pos, Statement iterator, Exp exp, Statement operation, Statement body) {
		List<Statement> whileContent = new ArrayList<Statement>();
		whileContent.add(0, body);
		whileContent.add(1, operation);

		Statement whileBlock = newWhileBlock(pos, exp, newBlock(pos, whileContent));

		List<Statement> statements = new ArrayList<Statement>();
		statements.add(iterator);
		statements.add(whileBlock);

		return newBlock(pos, statements);
	}

	//: <stmt> ::= # `for `( <assign> `; `; <assign> `) <stmt> =>
	public Statement newTrueForLoop(int pos, Statement iterator, Statement operation, Statement body) {
		List<Statement> whileContent = new ArrayList<Statement>();
		whileContent.add(0, body);
		whileContent.add(1, operation);

		Statement whileBlock = newWhileBlock(pos, newTrue(pos), newBlock(pos, whileContent));

		List<Statement> statements = new ArrayList<Statement>();
		statements.add(iterator);
		statements.add(whileBlock);

		return newBlock(pos, statements);
	}

	//: <stmt> ::= # `while `( <exp> `) <stmt> =>
	public Statement newWhileBlock(int pos, Exp exp, Statement body) {
		return new While(pos, exp, body);
	}


	//: <stmt> ::= # `break `; =>
	public Statement newBreak(int pos) {
		return new Break(pos);
	}

	//: <assign> ::= <exp> # `= <exp> =>
	public Statement assign(Exp lhs, int pos, Exp rhs) {
		return new Assign(pos, lhs, rhs);
	}

	//: <assign> ::= # ID `++ =>
	public Statement assignPlusPlus(int pos, String var) {
		Exp lhs = new IdentifierExp(pos, var);
		Exp rhs = new Plus(pos, lhs, new IntegerLiteral(pos, 1));

		return new Assign(pos, lhs, rhs);
	}

	//: <assign> ::= # `++ ID =>
	public Statement assignPlusPlusLeft(int pos, String var) {
		Exp lhs = new IdentifierExp(pos, var);
		Exp rhs = new Plus(pos, lhs, new IntegerLiteral(pos, 1));

		return new Assign(pos, lhs, rhs);
	}

	//: <assign> ::= # ID `-- =>
	public Statement assignMinusMinus(int pos, String var) {
		Exp lhs = new IdentifierExp(pos, var);
		Exp rhs = new Minus(pos, lhs, new IntegerLiteral(pos, 1));

		return new Assign(pos, lhs, rhs);

	}

	//: <assign> ::= # `-- ID =>
	public Statement assignMinusMinusLeft(int pos, String var) {
		Exp lhs = new IdentifierExp(pos, var);
		Exp rhs = new Minus(pos, lhs, new IntegerLiteral(pos, 1));

		return new Assign(pos, lhs, rhs);

	}

	//: <local var decl> ::= <type> # ID `= <exp> =>
	public Statement localVarDecl(Type t, int pos, String name, Exp init) {
		return new LocalDeclStatement(pos, new LocalVarDecl(pos, t, name, init));
	}

	//: <inst var decl> ::= <type> # ID `; =>
	public Decl instanceVarDecl(Type t, int pos, String name) {
		return new InstVarDecl(pos, t, name);
	}

	//: <stmt> ::= # `; =>
	public Statement newEmptyStmt(int pos) {
		return new Block(pos, new StatementList());
	}

	//: <stmt> ::= # `switch `( <exp> `) `{ <case>* `} =>
	public Statement newSwitch(int pos, Exp condition, List<Statement> cases) {
		return new Switch(pos, condition, new StatementList(cases));
	}

	//: <case> ::= `case # <exp> `; =>
	public Statement newCase(int pos, Exp e) {
		return new Case(pos, e);
	}

	/** ==========================================================================
	// EXPRESSIONS (Based on Slide 6.2 from Notes)
	// ASSIGNING
	// exp1 ::= ID, INTLIT, STRINGLIT, Array

	// MUTATE VAL VIA CASTING
	// exp2 ::= +exp , -exp, !exp, (ID)exp

	// MULT,DIV,REMAINDER OPERATIONS
	// exp3 ::= exp * exp, exp / exp, exp % exp

	// ADD/MINUS OPERATIONS
	// exp4 ::= exp + exp, exp - exp

	// COMPARISON OPERATIONS
	// exp 5 ::= exp < exp, exp > exp, exp <= exp, exp >= exp, exp ::= instanceof ID

	// EQUAL OPERATIONS
	// exp6 ::= exp != exp, exp == exp

	// AND OPERATION
	// exp7 ::= exp && exp

	// OR OPERATION
	// exp8 ::= exp || exp
	============================================================================== */

	//: <exp> ::= <exp8> => pass
	//: <exp8> ::= <exp7> => pass
	//: <exp7> ::= <exp6> => pass
	//: <exp6> ::= <exp5> => pass
	//: <exp5> ::= <exp4> => pass
	//: <exp4> ::= <exp3> => pass
	//: <exp3> ::= <exp2> => pass
	//: <exp2> ::= <exp1> => pass

	//: <exp8> ::= <exp8> # `|| <exp7> =>
	public Exp newOr(Exp e1, int pos, Exp e2) {
		return new Or(pos, e1, e2);
	}

	//: <exp7> ::= <exp7> # `&& <exp6> =>
	public Exp newAnd(Exp e1, int pos, Exp e2) {
		return new And(pos, e1, e2);
	}

	//: <exp6> ::= <exp6> # `== <exp5> =>
	public Exp newDoubleEqualTo(Exp e1, int pos, Exp e2) {
		return new Equals(pos, e1, e2);
	}

	//: <exp6> ::= <exp6> # `!= <exp5> =>
	public Exp newNotEqualTo(Exp e1, int pos, Exp e2) {
		return newUnaryNot(pos, new Equals(pos, e1, e2));
	}

	//: <exp5> ::= <exp5> # `< <exp4> =>
	public Exp newLessThan(Exp left, int pos, Exp right) {
		return new LessThan(pos, left, right);
	}

	//: <exp5> ::= <exp5> # `<= <exp4> =>
	public Exp newLessThanEqualTo(Exp left, int pos, Exp right) {
		return new Not(pos, new LessThan(pos, left, right));
	}

	//: <exp5> ::= <exp5> # `> <exp4> =>
	public Exp newGreaterThan(Exp left, int pos, Exp right) {
		return new GreaterThan(pos, left, right);

	}

	//: <exp4> ::= <exp4> # `+ <exp3> =>
	public Exp newPlus(Exp e1, int pos, Exp e2) {
		return new Plus(pos, e1, e2);
	}

	//: <exp4> ::= <exp4> # `- <exp3> =>
	public Exp newMinus(Exp e1, int pos, Exp e2) {
		return new Minus(pos, e1, e2);
	}

	//: <exp3> ::= <exp3> # `* <exp2> =>
	public Exp newTimes(Exp e1, int pos, Exp e2) {
		return new Times(pos, e1, e2);
	}

	//: <exp3> ::= <exp3> # `/ <exp2> =>
	public Exp newDivide(Exp e1, int pos, Exp e2) {
		return new Divide(pos, e1, e2);
	}

	//: <exp3> ::= <exp3> # `% <exp2> =>
	public Exp newRemainder(Exp e1, int pos, Exp e2) {
		return new Remainder(pos, e1, e2);
	}

	//: <exp2> ::= # `( <type> `) <exp1> =>
	public Exp newCast(int pos, Type t, Exp e) {
		return new Cast(pos, t, e);
	}

	//: <exp2> ::= # `+ <exp1> =>
	public Exp newUnaryPlus(int pos, Exp e) {
		return new Plus(pos, new IntegerLiteral(pos, 0), e);
	}

	//: <exp2> ::= # `- <exp1> =>
	public Exp newUnaryMinus(int pos, Exp e) {
		return new Minus(pos, new IntegerLiteral(pos, 0), e);
	}

	//: <exp2> ::= # `! <exp1> =>
	public Exp newUnaryNot(int pos, Exp e) {
		return new Not(pos, e);
	}

	// //: <exp2> ::= # <exp1> &<arrLength> =>
	// public Exp newArrayLength(int pos, Exp e) {
	// 	return new ArrayLength(pos, e);
	// }

	//// : <arrLength> ::= "./length" !ID => null

	//: <exp1> ::= # ID  =>
	public Exp newIdentfierExp(int pos, String name) {
		return new IdentifierExp(pos, name);
	}

	//: <exp1> ::= <exp1> !<empty bracket pair> # `[ <exp> `] =>
	public Exp newArrayLookup(Exp e1, int pos, Exp e2) {
		return new ArrayLookup(pos, e1, e2);
	}

	//: <exp1> ::= # INTLIT =>
	public Exp newIntegerLiteral(int pos, int n) {
		return new IntegerLiteral(pos, n);
	}

	//: <exp1> ::= # STRINGLIT =>
	public Exp newStringLiteral(int pos, String s) {
		return new StringLiteral(pos, s);
	}

	//: <exp1> ::= # CHARLIT =>
	public Exp newCharLiteral(int pos, int charAscii) {
		return new IntegerLiteral(pos, charAscii);
	}

	//: <exp1> ::= <exp1> `. # ID =>
	public Exp newInstVarAccess(Exp e, int pos, String name) {
		return new InstVarAccess(pos, e, name);
	}

	//: <exp1> ::= # `this =>
	public Exp newThis(int pos) {
		return new This(pos);
	}

	//: <exp1> ::= # `true =>
	public Exp newTrue(int pos) {
		return new True(pos);
	}

	//: <exp1> ::= # `false =>
	public Exp newFalse(int pos) {
		return new False(pos);
	}

	//: <exp1> ::= # `null =>
	public Exp newNullExp(int pos) {
		return new Null(pos);
	}

	//: <exp1> ::= # `new # ID `( `) =>
	public Exp newObject(int pos, int typePos, String name) {
		return new NewObject(pos, new IdentifierType(typePos, name));
	}

	//: <exp1> ::= `new <type> !<empty bracket pair> # `[ <exp> `] <empty bracket pair>** =>
	public Exp newArray(Type t, int pos, Exp e, List<Object> arrSize) {
		ArrayType newArr = new ArrayType(pos, t);
		for(int i = 0; i < arrSize.size(); i++) {
			newArr = new ArrayType(pos, newArr);
		}
		return new NewArray(pos, newArr, e);
	}

	//: <expList> ::= <exp> <next exp>* =>
	public ExpList newExpList(Exp first, List<Exp> rest) {
		rest.add(first);
		return new ExpList(rest);
	}

	//: <expList> ::= =>
	public ExpList newEmptyExpList() {
		return new ExpList();
	}

	//: <next exp> ::= `, <exp> => pass



	//================================================================
	// Lexical grammar for filtered language begins here: DO NOT
	// MODIFY ANYTHING BELOW THIS, UNLESS YOU REPLACE IT WITH YOUR
	// ENTIRE LEXICAL GRAMMAR, and set the constant FILTER_GRAMMAR
	// (defined near the top of this file) to false.
	//================================================================

	//: letter ::= {"a".."z" "A".."Z"} => pass
	//: letter128 ::= {225..250 193..218} =>
	public char sub128(char orig) {
		return (char)(orig-128);
	}
	//: digit ::= {"0".."9"} => pass
	//: digit128 ::= {176..185} => char sub128(char)
	//: any ::= {0..127} => pass
	//: any128 ::= {128..255} => char sub128(char)
	//: ws ::= " "
	//: ws ::= {10} registerNewline
	//: registerNewline ::= # => void registerNewline(int)
	//: `boolean ::= "#bo" ws*
	//: `class ::= "#cl" ws*
	//: `extends ::= "#ex" ws*
	//: `void ::= "#vo" ws*
	//: `int ::= "#it" ws*
	//: `while ::= "#wh" ws*
	//: `if ::= '#+' ws*
	//: `else ::= "#el" ws*
	//: `for ::= "#fo" ws*
	//: `break ::= "#br" ws*
	//: `this ::= "#th" ws*
	//: `false ::= '#fa' ws*
	//: `true ::= "#tr" ws*
	//: `super ::= "#su" ws*
	//: `null ::= "#nu" ws*
	//: `return ::= "#re" ws*
	//: `instanceof ::= "#in" ws*
	//: `new ::= "#ne" ws*
	//: `abstract ::= "#ab" ws*
	//: `assert ::= "#as" ws*
	//: `byte ::= "#by" ws*
	//: `case ::= "#ce" ws*
	//: `catch ::= "#ca" ws*
	//: `char ::= "#ch" ws*
	//: `const ::= "#ct" ws*
	//: `continue ::= "#co" ws*
	//: `default ::= "#de" ws*
	//: `do ::= "#-" ws*
	//: `double ::= "#do" ws*
	//: `enum ::= "#en" ws*
	//: `final ::= "#fi" ws*
	//: `finally ::= "#fy" ws*
	//: `float ::= "#fl" ws*
	//: `goto ::= "#go" ws*
	//: `implements ::= "#is" ws*
	//: `import ::= "#im" ws*
	//: `interface ::= "#ie" ws*
	//: `long ::= "#lo" ws*
	//: `native ::= "#na" ws*
	//: `package ::= "#pa" ws*
	//: `private ::= "#pr" ws*
	//: `protected ::= "#pd" ws*
	//: `public ::= "#pu" ws*
	//: `short ::= "#sh" ws*
	//: `static ::= '#sc' ws*
	//: `strictfp ::= "#st" ws*
	//: `switch ::= "#sw" ws*
	//: `synchronized ::= "#sy" ws*
	//: `throw ::= "#tw" ws*
	//: `throws ::= "#ts" ws*
	//: `transient ::= "#tt" ws*
	//: `try ::= "#ty" ws*
	//: `volatile ::= "#ve" ws*
	
	//: `! ::=  "!" ws* => void
	//: `!= ::=  "@!" ws* => void
	//: `% ::= "%" ws* => void
	//: `&& ::= "@&" ws* => void
	//: `* ::= "*" ws* => void
	//: `( ::= "(" ws* => void
	//: `) ::= ")" ws* => void
	//: `{ ::= "{" ws* => void
	//: `} ::= "}" ws* => void
	//: `- ::= "-" ws* => void
	//: `+ ::= "+" ws* => void
	//: `= ::= "=" ws* => void
	//: `== ::= "@=" ws* => void
	//: `[ ::= "[" ws* => void
	//: `] ::= "]" ws* => void
	//: `|| ::= "@|" ws* => void
	//: `< ::= "<" ws* => void
	//: `<= ::= "@<" ws* => void
	//: `, ::= "," ws* => void
	//: `> ::= ">"  !'=' ws* => void
	//: `>= ::= "@>" ws* => void
	//: `: ::= ":" ws* => void
	//: `. ::= "." ws* => void
	//: `; ::= ";" ws* => void
	//: `++ ::= "@+" ws* => void
	//: `-- ::= "@-" ws* => void
	//: `/ ::= "/" ws* => void

	
	//: ID ::= letter128 ws* => text
	//: ID ::= letter idChar* idChar128 ws* => text
	
	//: INTLIT ::= {"1".."9"} digit* digit128 ws* => 
	public int convertToInt(char c, List<Character> mid, char last) {
		return Integer.parseInt(""+c+mid+last);
	}
	//: INTLIT ::= digit128 ws* => 
	public int convertToInt(char c) {
		return Integer.parseInt(""+c);
	}
	//: INTLIT ::= "0" hexDigit* hexDigit128 ws* => 
	public int convert16ToInt(char c, List<Character> mid, char last) {
		return Integer.parseInt(""+c+mid+last, 16);
	}
	//: STRINGLIT ::= '@"' ws* =>
	public String emptyString(char x, char xx) {
		return "";
	}
	//: STRINGLIT ::= '"' any* any128 ws* =>
	public String string(char x, List<Character> mid, char last) {
		return ""+mid+last;
	}
	//: CHARLIT ::= "'" any ws* =>
	public int charVal(char x, char val) {
		return val;
	}
	
	//: idChar ::= letter => pass
	//: idChar ::= digit => pass
	//: idChar ::= "_" => pass
	//: idChar128 ::= letter128 => pass
	//: idChar128 ::= digit128 => pass
	//: idChar128 ::= {223} => 
	public char underscore(char x) {
		return '_';
	}
	//: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} => pass
	//: hexDigit128 ::= {176..185 225..230 193..198} => char sub128(char)

}