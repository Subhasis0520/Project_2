package com.company;

import java.util.Scanner;

public class Nested_TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = new int[3];
        marks[0] = 70;
        marks[1] = 56;
        marks[2] = 62;
        System.out.println("Enter th index number ");
        int ind =sc.nextInt();
        try {
            System.out.println("Welcome to the code");
            try {
                System.out.println(marks[ind]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Exception lvl 1");
                System.out.println("The idex does not exists");
            }
        }
        catch (Exception e){
            System.out.println("Execption lvl 2");
        }
    }
}
