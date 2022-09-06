package com.company;
import java.util.*;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> l1= new ArrayList<>();
        ArrayList<Integer> l2= new ArrayList<>();
        l1.add(5);
        l1.add(6);
        l1.add(4);
        l1.add(7);
        l1.add(8);
        l1.add(0,1);
        l1.add(1,2);
        l2.add(12);
        l2.add(23);
        l2.add(27);
        l1.addAll(0,l2);
       // l1.clear();
        System.out.println(l1.contains(5));
        System.out.println(l1.indexOf(27));
        l1.set(7,85);
        l1.remove(4);
        for(int i =0; i<l1.size();i++){
            System.out.println(l1.get(i));
        }
    }
}
