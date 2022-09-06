package com.company;


class Solve extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning!");
        }
    }
}
class Solve2 extends Thread{
    public void run(){

    }
}

public class Question {
    public static void main(String[] args) {
        Solve p1 = new Solve();
        Solve2 p2 = new Solve2();

        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());

        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}



