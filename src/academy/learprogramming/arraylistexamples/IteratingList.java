package academy.learprogramming.arraylistexamples;

import java.util.*;

public class IteratingList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);

        for(int i = 0 ; i < numbers.size(); i ++ ) {
            System.out.println("index at = " + i);
           // numbers.remove(i);
        }

        System.out.println(numbers);

        for (Integer number: numbers) {
            System.out.println("numbers = " + number);
            //numbers.remove(2); // concurrent modification
        }

        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            System.out.println(number);
            iterator.remove();
        }

        System.out.println(numbers);

        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        for(ListIterator<Integer> listIterator = numbers.listIterator(3); listIterator.hasPrevious(); ) {
            System.out.println(listIterator.previous());
        }
    }
}
