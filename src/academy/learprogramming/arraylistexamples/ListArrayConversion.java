package academy.learprogramming.arraylistexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversion {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tony");
        names.add("Jimmy");
        names.add("Authony");

        Object[] namesArray = names.toArray();

        String[] stringArray = names.toArray(new String[0]);

        String[] anotherStringArray = names.toArray(new String[names.size()]);
        System.out.println(anotherStringArray);

        // convert array to list
        String[] petsArray = {"dog", "cat", "parrot"};
        List<String> petsList = Arrays.asList(petsArray);
        System.out.println(petsList);

        petsList.set(0, "bird");
        System.out.println(Arrays.toString(petsArray));
    }
}
