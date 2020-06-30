package academy.learprogramming.javabasics;

/**
 *
 */
public class Main {

    /**
     * This is main method
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("args-size = " + args.length);

        // Printing arguments

        for (int i = 0; i <args.length; i++) {
            System.out.println("arg " + i + " -> " + args[i]);
        }

        sum(1, 2);
    }

    /**
     * Caculate sum between two method
     * @param a operation
     * @param b operand
     * @return sum
     */
    public static int sum (int a, int b) {
        return a + b;
    }

}
