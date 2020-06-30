package academy.learprogramming.javabasics;

public class DeclaringAndInitializingVariables {

    public static void main(String[] args) {

        // declaring and initializing in two lines
        int myNumber; // declaration
        //System.out.printf("myNumber = " + myNumber); // does not compike

        myNumber = 10; // initialization

        System.out.println("myNumber = " + myNumber);

        // one line
        double myDouble = 7.50;
        System.out.println("myDouble = " + myDouble);

        float myFloat1, myFloat2, myFloat3;
        float myFloat4; float myFloat5;

        float myFloat6 = 5f, myFloat7 = 10f, myFloat8;

        boolean b1, b2;

        //double d1, double d2; // multiple identifier in one line

        int i1;
        int i2;
        //int i3; i4;// does not compile

        // identifier naming condition
        //int int = 10; // will not compile
        // Java is case sensitive
        char cHaR;
        char Char;

        float okFloat;
        double $ok2Double; // can begain with $ and underscore
        double _alsoDouble;
        float __okButNotNice$_123;

        // illegale examples
        //double 3Dpoint; // names can't begin with numbers
        //double my@street; // can't have @
    }
}
