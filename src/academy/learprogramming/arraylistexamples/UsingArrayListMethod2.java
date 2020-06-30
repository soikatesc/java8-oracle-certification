package academy.learprogramming.arraylistexamples;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayListMethod2 {
    public static void main(String[] args) {
        List<String> pets = new ArrayList<>();
        System.out.println(pets.isEmpty()); // true
        System.out.println(pets.size()); // return the size

        if (pets.isEmpty()) {
            System.out.println("no pets");
        }

        if (pets.size() == 0) {
            System.out.println("no pets");
        }

        pets.add("cat");
        System.out.println(pets.isEmpty());
        System.out.println(pets.size());

        pets.clear();
        System.out.println(pets.isEmpty());
        System.out.println(pets.size());

        pets.add("dog");
        System.out.println(pets.contains("cat")); // return false
        System.out.println(pets.contains("dog"));

        List<String> newPets = new ArrayList<>();
        newPets.add("dog");

        System.out.println(pets.equals(newPets));

        newPets.add("cat");
        System.out.println(pets.equals(newPets));

    }
}
