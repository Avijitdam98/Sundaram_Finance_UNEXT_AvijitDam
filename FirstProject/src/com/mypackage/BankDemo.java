package com.mypackage;


public class BankDemo {
    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount("101", "Avijit", 5000);
        BankAccount account2 = new BankAccount("102", "Ajay", 3000);


        account1.deposit(1500);
        account2.withdraw(500);

        
        System.out.println("Before changing interest rate:");
        account1.displayAccountDetails();
        account2.displayAccountDetails();

        
        BankAccount.setInterestRate(4.2);

        
        System.out.println("After changing interest rate:");
        account1.displayAccountDetails();
        account2.displayAccountDetails();
    }
}
