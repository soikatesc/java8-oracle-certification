package academy.learprogramming.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        int[] one= new int[3]; // arrays with 3 elements
        int[] two = new int[]{10 , 11, 13}; // array with 3 elements not empty array

//        double[] a = new double[2.55]; does nto compile
        double[] b = new double[ 4 * 5 / 2]; // crate array with 10 elements

        int x = 4;
        int y = 4;

        double[] c = new double[ x * y]; // creare 16 elements
        int[] three = {10, 11, 12}; // anonomyous array
        int[] four = {}; // size of the array is zero;

        int[] a1;
        int[] a2;
        int a3[];
        int a4[];
        int[] ids, types; // create two arrays
        int ids2[], types2; // create array and int

        String[] animals = {"Parrot", "Dog", "Cat"};
        String[] myAnimals = animals;
        String[] otehrAnimals = {"Parrot", "Dog", "Cat"};

        System.out.println(animals.equals(myAnimals)); // true // same references
        System.out.println(animals == myAnimals);
        System.out.println(Arrays.equals(animals, myAnimals));

        System.out.println(animals.equals(otehrAnimals)); //false
        System.out.println(animals == otehrAnimals);
        System.out.println(Arrays.equals(animals, otehrAnimals));

        System.out.println(Arrays.toString(animals));
    }
}
