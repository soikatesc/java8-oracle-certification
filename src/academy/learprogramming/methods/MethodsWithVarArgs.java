package academy.learprogramming.methods;

import java.util.Arrays;

public class MethodsWithVarArgs {

    public void jump1(int... numbers) {

    }

    public void jump2(int start, int... numbers) {

    }

//    public void jump2(int... numbers, int start) { // dosen't compile
//
//    }

    public void jump5(int[] start, int[] numbers) {

    }

    public static void main(String[] args) {
        jump(1);
        jump(2, 3);
        jump(4, 5, 6, 7);
        jump(1, new int[] {4, 5, 6}); // redundant array creation
        // // null pointer exception
        run();
        run(5, 6, 7, 8);
    }

    public static void jump(int start, int... numbers) {
        System.out.println("start = " + start + " numbers.length = " + numbers.length);
    }

    public static void run (int... numbers) {
        for(int number: numbers) {
            System.out.println("numbers= " + number);
        }

        System.out.println(Arrays.toString(numbers));
    }
}
