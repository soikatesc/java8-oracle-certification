package academy.learprogramming.arraylistexamples;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList<>();
        ArrayList<Object> myList2 = new ArrayList<>();

        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        System.out.println(list);

        List<String> list3 = new ArrayList<>();  // using interface as type

        //ArrayList<String> list4 = new List<>();  // does not compile

        List<String> list5 = new ArrayList<>();

        int[] a = {1, 2};
        int[] b = {1, 2};
        System.out.println(Arrays.equals(a, b));
        List<String> dummy = new ArrayList<>();
        dummy.add("hello");
        for (String s: list) {
            System.out.printf(s);
        }



    }
}
