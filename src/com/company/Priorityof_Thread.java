package com.company;
class MyThread4 extends Thread{
    public MyThread4(String name){
        super(name);
    }
    public void run(){
        int i = 2000;
        for(i=2000; i>=0;i--){
            System.out.println("I am happy" +this.getName());
        }
    }

    public void getPriority(int minPriority) {
    }
}

public class Priorityof_Thread {
    public static void main(String[] args) {
        MyThread4 t1 = new MyThread4("Sonu");
        MyThread4 t2= new MyThread4("Raju");
        MyThread4 t3 = new MyThread4("Bonu");
        MyThread4 t4 = new MyThread4("Titu");
        MyThread4 t5 = new MyThread4("Puchi");
        t5.getPriority(Thread.MAX_PRIORITY);
        t3.getPriority(Thread.NORM_PRIORITY);
        t4.getPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();



    }
}
