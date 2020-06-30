package academy.learprogramming.javabasics;

public class PrimitivesCharAndBoolean {

    public static void main(String[] args) {

        char ch = 'a';

//        char ch1 = 'ab';
        char ch1 = '1';
        char uniChar = '\u03A9'; // uppercase greek omega character
        char romanNumber = '\u216c'; // roman 50 number

        System.out.println("ch1 = " + ch1);
        System.out.println("uniChar = " + uniChar);
        System.out.println("RomanNumber = " + romanNumber);

        boolean myBoolean = true;
        boolean myFalseBoolean = false;

        System.out.println("myBoolean = " + myBoolean);
        System.out.println("myFalseBoolean = " + myFalseBoolean);
    }
}
