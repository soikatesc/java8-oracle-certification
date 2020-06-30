package academy.learprogramming.operators;

public class ArthmeticOperators {

    public static void main(String[] args) {

        int result = 3 - 2 + 2 * 2 + 3;
        System.out.println("result = " + result);

        result = 4 / 2 + 1 - 4 * 2 + 10;
        /*
           2 + 1 - 8 + 10
           3 - 8 + 10
           -5 + 10
           5
        */

        System.out.println("result = " + result);

        int a = 4;
        int b =  3 - 2 * --a; // decrement and use
        System.out.println("b = " + b);

        a = 4;
        b = 3 - 2 * a--; // use and decrement
        System.out.println("b => " + b);

        long c = 2;
        long d = 4 + 3 * c++; // use and increment
        System.out.println("d = " + d);

        c = 2;
        d = 4 + 3 * ++c;
        System.out.println("d => " + d);
    }
}
