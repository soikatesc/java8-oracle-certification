package academy.learprogramming.classdesign.classinheritance;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.MonthDay;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    // only main class does not have any parent class
    // 1. parent class are initialize first
    // 2.
    public static void main(String[] args) throws Exception {
//        Husky husky = new Husky(2);
//        husky.printDetails();
//        husky.eat();
//        System.out.println(husky.getAverageWeight());

//        Dog dog = new Dog(3);
//        dog.setName("Rex");
//        dog.printDetails();

//        Rabit rabit = new Rabit(3);

        Calendar cal = Calendar.getInstance();
        cal.set(2015, 8, 5);

        DayOfWeek dayOfWeek = DayOfWeek.of(cal.get(Calendar.DAY_OF_WEEK));
        System.out.printf(dayOfWeek.name());

    }
}