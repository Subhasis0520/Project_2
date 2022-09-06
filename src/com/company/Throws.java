package com.company;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}

public class Throws {

    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }



    public static void main(String[] args) {

        try{
            double ar = area(7);
            System.out.println("Area of the circle is " + ar);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}