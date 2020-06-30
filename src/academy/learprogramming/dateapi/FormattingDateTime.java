package academy.learprogramming.dateapi;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Date;

public class FormattingDateTime {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2010, Month.APRIL, 15);
        LocalTime time = LocalTime.of(11, 22, 33);
        LocalDateTime localDateTime = LocalDateTime.of(date, time);

        System.out.println(localDateTime);
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));

        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(shortFormatter.format(localDateTime));
        System.out.println(mediumFormatter.format(date));
        //System.out.println(shortFormatter.format(time));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm:ss");
        System.out.println(formatter.format(localDateTime));

        // Before JAVA 8
        SimpleDateFormat sf = new SimpleDateFormat("hh:mm");
        System.out.println(sf.format(new Date()));

    }
}
