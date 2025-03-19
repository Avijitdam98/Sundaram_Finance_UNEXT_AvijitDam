package com.exceptions;

import java.util.Scanner;

public class Practice1{

    static void checkNumber(int number) throws IllegalArgumentException, ArithmeticException {
        if (number < 0) {
            throw new IllegalArgumentException("Error: Negative values are not permitted!");
        } else if (number == 0) {
            throw new ArithmeticException("Error: Zero is not an acceptable input!");
        } else if(number>=100) {
        	throw new NumberFormatException("Number out of bound");
        }
        else {
            System.out.println("Success! You entered a valid number: " + number);
        }
    }

    public static void main(String[] args) throws IllegalArgumentException, ArithmeticException {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Please enter a number: ");
            int input = scanner.nextInt();  
            checkNumber(input);    
        } 
        catch (IllegalArgumentException | ArithmeticException ex) {
            System.out.println("Exception caught: " + ex.getMessage());
        } 
    }
}
