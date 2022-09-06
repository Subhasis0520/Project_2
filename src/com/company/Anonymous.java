package com.company;

@FunctionalInterface
    interface Animal{
        void bark();
    }

public class Anonymous {
        public static void main(String[] args) {
            Animal Bruno = new Animal() {
                @Override
                public void bark() {
                    System.out.println("Dog barks!");
                }
            };
            Bruno.bark();
        }
    }

