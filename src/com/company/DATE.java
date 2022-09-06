package com.company;
import java.util.Date;
public class DATE {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("The current date is " +d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
        System.out.println(d.getHours());
        System.out.println(d.getMonth());
    }
}