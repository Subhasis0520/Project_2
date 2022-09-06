package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
       // DateTimeFormatter df = DateTimeFormatter.ofPattern("dd:MM:yyyy");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd:MM:yyyy H:ma E");
       // DateTimeFormatter df = DateTimeFormatter.BASIC_ISO_DATE;
      //  DateTimeFormatter df = DateTimeFormatter.ISO_ORDINAL_DATE;
       //DateTimeFormatter df = DateTimeFormatter.ISO_WEEK_DATE;
        String myDate = dt.format(df);
        System.out.println("My date is: " + myDate);
    }
}
