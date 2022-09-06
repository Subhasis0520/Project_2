package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Java_File {
    public static void main(String[] args) {
        File myfile = new File("text1.txt");

       // try {
       //    myfile.createNewFile();
      //      System.out.println("This is my first file");
     //   } catch (IOException e) {
      //      e.printStackTrace();
      //  }
        try {
            FileWriter fileWriter = new FileWriter("text1.txt");
           fileWriter.write ("My name is Subhasis Ghosh. It is my 1st java file.\n Hello!Everyone....");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

  /*
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

         */
    }
}


