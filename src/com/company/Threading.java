package com.company;

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<300){
            System.out.println("Thread 1 for cooking");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<300){
            System.out.println("Thread 2 for Chatting with her");
            System.out.println("I am enjoying!");
            i++;
        }
    }
}

public class Threading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

    }
}



