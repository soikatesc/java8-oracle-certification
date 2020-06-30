package academy.learprogramming.dateapi;

import java.time.*;
import java.util.Calendar;
import java.util.Date;

public class CreatingDateAndTime {
    public static void main(String[] args) {
        // to get date
        System.out.println(LocalDate.now());

        // to get time
        System.out.println(LocalTime.now());

        // to get date and time
        System.out.println(LocalDateTime.now());

        LocalDate localDate = LocalDate.of(2017, Month.JANUARY, 1);
        LocalTime localTime = LocalTime.of(10, 30);

        System.out.println(localDate);
        System.out.println(localTime);

        System.out.println(LocalDateTime.of(localDate, localTime));


        // Creating localdate form a date year, month, day
        LocalDate lDate = LocalDate.of(2017, Month.JANUARY, 25);
        String dayOfWeek = lDate.getDayOfWeek().name();
        System.out.println(dayOfWeek);


        // Before JAVA 8 ///////
        System.out.println(new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.set(2015, Calendar.JANUARY, 1);
        Date january = calendar.getTime();
        System.out.println(january);

    }
}
