package com.company;

public class Finally_Keyword {
    public static int meth1() {
        try {
            int a = 100;
            int b = 0;
            int c = a / b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("I am the final keyword");
        }
        return 0;
    }

    public static void main(String[] args) {
       int k = meth1();
        System.out.println(k);
        int x=120;
        int y=10;
        while (true){
            try{
                System.out.println(x/y);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("The value of y is " + y);
            }
            y--;
        }
    }
}