package com.company;
import java.util.*;
public class Link_List {
    public static void main(String[] args) {
        LinkedList<Integer> l1= new  LinkedList<>();
        LinkedList<Integer> l2= new  LinkedList<>();
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
        l1.addFirst(122);
        l1.addLast(186);
        for(int i =0; i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
