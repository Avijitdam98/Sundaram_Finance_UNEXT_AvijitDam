package com.exceptions;

import java.io.IOException;

public class ThrowsEx {
    
    static void meth() throws IOException,ArithmeticException {
        System.out.println("Welcome to meth");
       // throw new IOException("Demo Exception");
        throw new ArithmeticException("Arithmetic Error Occurred");
    }

    public static void main(String[] args) {
        try {
            meth();
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Hello"); 
    }
}
