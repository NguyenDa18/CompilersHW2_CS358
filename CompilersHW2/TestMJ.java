// This file should be parsable by the Assignment 2 starter-file grammar.
// Note that it has semantic errors, such as references to undefined
// and mismatched types--but these will not be caught until Assignment 3
// and Assignment 4.
class Main { 
  /* this is a comment */
  /*/ this is another comment */
  /*   /* this is another comment */
  public void main() {
    new RunClass().exec();
  }
}

class RunClass extends Lib {
    public int numSum(int[] anArray) {
        int sum = 0;
        for (int i = 0; i < anArray.length; i++)
            sum = sum + anArray[i];
        return sum;
    }

    public void readArray(int[] anArray) {
        for (int i = 0; i < anArray.length; i++)
            anArray[i] = readInt();
    }
    public void exec() {
        int[] myArray = new int[100];
    }
}
