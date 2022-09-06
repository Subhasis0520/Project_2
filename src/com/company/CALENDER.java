package com.company;
import java.util.*;
public class CALENDER {

        public static void main(String[] args) {
            Calendar c = Calendar.getInstance();
            System.out.println(c.getCalendarType());
            System.out.println(c.getTimeZone());
            System.out.println(c.getTime());
            System.out.println("Current year is :"+ c.get(Calendar.YEAR));
            System.out.println("Current month is :"+ c.get(Calendar.MONTH));
            System.out.println("Current day is :"+ c.get(Calendar.DAY_OF_WEEK));
            System.out.println("Current hour is :"+ c.get(Calendar.HOUR_OF_DAY));
            System.out.println("Current minute is :"+ c.get(Calendar.MINUTE));
            System.out.println("Current second is :"+ c.get(Calendar.SECOND));
            System.out.println("Weeks in a year " + c.getWeeksInWeekYear());
        }
    }


