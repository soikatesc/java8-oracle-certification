package academy.learprogramming.arraylistexamples;

import java.util.ArrayList;
import java.util.List;

public class UsingWrappersInList {
    public static void main(String[] args) {

        // can't use primitive to List
        //List<double> doubleList = new ArrayList<>(); // does not compile
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(10.5); // autoboxing
        doubleList.add(new Double(55.10));
        doubleList.remove(55.10); //autoboxing\

        double first = doubleList.get(0);
        System.out.println(doubleList);
        System.out.println(first);

        System.out.println("----Integer-----");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(null);
        System.out.println(numbers);

        //int number = numbers.get(0); // null pointer exception, int can't hold null

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.remove(new Integer(1));
        System.out.println(nums);

        List<Integer> elements = new ArrayList<>();
        elements.add(10);
        int firstElemnt = elements.get(0);
        System.out.println(firstElemnt);
    }
}
