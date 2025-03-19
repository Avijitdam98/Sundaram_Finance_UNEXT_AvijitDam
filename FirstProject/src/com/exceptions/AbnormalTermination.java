package com.exceptions;

import java.util.Scanner;

public class AbnormalTermination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

    
        try {
           int d = 43 / a; 
           System.out.println(d);
           int arr[]= {1,2,3};
           System.out.println(arr[4]);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println(e);
        }
        
        

       
        System.out.println("Hello");

        sc.close(); 
    }
}
