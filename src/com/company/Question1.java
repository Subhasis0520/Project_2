package com.company;

import java.util.ArrayList;

public class Question1 {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("Subhasis");
        ar.add("Susmita");
        ar.add("Abhijit");
        ar.add("Anup");
        ar.add("Sudip");
        ar.add("Clinton");
        ar.add("LaxmiKanta");
        ar.add("Debasish");
        ar.add("Syewta");
        ar.add("Sayan");
        for(Object o : ar){
            System.out.println(o);
        }
    }
}
