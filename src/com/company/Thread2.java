package com.company;
class MyThread3 extends Thread{
    public MyThread3(String name){
       super(name);
    }
    public void run(){
        int i =34;
        for(i=34; i>=0;i--){
            System.out.println("I am happy");
        }
    }
}
public class Thread2 {
    public static void main(String[] args) {
      MyThread3 mt = new MyThread3("Sonu");
      mt.start();
        System.out.println("This my thread id no " + mt.getId());
        System.out.println(mt.getName());
    }
}
