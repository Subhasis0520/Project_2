package com.company;

class MyThreadRunnable1 implements Runnable{
    public void run(){
        for(int i =0; i<200; i++) {
            System.out.println("I am doing my 1st task that is listening music");
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i =0;
        for(i =0; i < 200; i++) {
            System.out.println("I am doing 2nd task");

        }
    }
}
public class Runable_Thread {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}

