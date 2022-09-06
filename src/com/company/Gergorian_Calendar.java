package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Gergorian_Calendar {
    public static void main(String[] args) {

        GregorianCalendar gcal = new GregorianCalendar();
        System.out.println("Before rolling time " + gcal.getTime());
        System.out.println(gcal.isLeapYear(2020));
        gcal.roll(Calendar.MONTH, true);
        gcal.roll(Calendar.DATE, false);
        gcal.roll(Calendar.YEAR, true);
        System.out.println("After rolling " + gcal.getTime());
        System.out.println("The hashcode for this calendar is : "+ gcal.hashCode());
        System.out.println(TimeZone.getAvailableIDs()[5]);
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[6]);
    }
}
