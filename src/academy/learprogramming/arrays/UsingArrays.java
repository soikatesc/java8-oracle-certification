package academy.learprogramming.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UsingArrays {
    public static void main(String[] args) {
        String[] pets = {"parrot", "cats", "dog"};
//        System.out.println(pets[0]);
//        System.out.println(pets[1]);
//        System.out.println(pets[2]);
        //System.out.println(pets[3]); // Exception out of bound

        pets[0] = "bird";
//        for (int i = 0; i < pets.length; i++) {
//            System.out.println(pets[i]);
//        }

//        for (int i = 0; i <= pets.length-1; i++) {
//            System.out.println(pets[i]);
//        }

        System.out.println(pets);
        System.out.println(Arrays.toString(pets));

        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));

        String[] newPets = new String[5];
        System.out.println(Arrays.toString(newPets));

        Integer[] arr = new Integer[2];
        System.out.println(Arrays.toString(arr));

    }
}
