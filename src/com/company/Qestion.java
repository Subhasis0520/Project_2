package com.company;

import java.util.Scanner;

public class Qestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index;
        int i =0;
       boolean flag = true;
       int[] marks = new int[4];
        marks[0] = 20;
        marks[1] = 320;
        marks[2] = 220;
        marks[3] = 120;
       while (flag && i<5){
           try {
               System.out.println("Enter the value of the index");
                index = sc.nextInt();
               System.out.println("The value of mark index is " + marks[index]);
               break;
           }
           catch (Exception e){
               System.out.println("Invalid index");
               i++;
           }

        }

       if(i>=5){
           System.out.println("Error");
       }
    }
}
