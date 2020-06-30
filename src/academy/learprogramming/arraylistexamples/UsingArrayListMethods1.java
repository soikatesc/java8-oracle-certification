package academy.learprogramming.arraylistexamples;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayListMethods1 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("Dog");
        list.add(5);

        System.out.println(list);

        List<String> pets = new ArrayList<>();
        pets.add("dog");

        pets.add(0, "cat");
        System.out.println(pets);

        // cat, dog
        pets.add(1, "parrot");
        System.out.println(pets);
        // cat, parrot, dog
        pets.remove("parrot");
        System.out.println(pets);

        pets.remove("something"); // does not do anything since the value does not exist in the array list

        //pets.remove(2); out of bound exception

        pets.set(0, "leo");
        //pets.set(6, "at 6"); //out of bound exception

        System.out.println(pets);


        List<Integer> someLIst = new ArrayList<>();
        someLIst.add(1);
        //int firtelem = someLIst.get(1);
        //System.out.printf(firtelem);
    }
}
