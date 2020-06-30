package academy.learprogramming.dateapi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class UsingPeriod {
    public static void main(String[] args) {

        LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2017, Month.APRIL, 30);
        Period period = Period.ofWeeks(1);

        // start.toEpochDay() // number of days


        cleanAnimalCage(start, end, period);

        System.out.println(start.plus(period));
        //System.out.println(LocalTime.now().plus(period)); // unsupported unit days
    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end, Period period) {
        while (start.isBefore(end)) {
            System.out.println("Need to clean the scase of date = " + start);
            start = start.plus(period);
        }
    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end) {
        while (start.isBefore(end)) {
            System.out.println("need to clean the case on date = " + start);
            start = start.plusMonths(1); //adding 1 months
        }
    }
}
