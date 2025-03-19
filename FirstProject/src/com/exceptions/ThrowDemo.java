package com.exceptions;

public class ThrowDemo {
  
    static void meth() {
        System.out.println("Welcome to meth");
        throw new ArithmeticException("Demo"); 
    }

    public static void main(String[] args) {
        try {
            meth(); 
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Hello"); 
    }
}
