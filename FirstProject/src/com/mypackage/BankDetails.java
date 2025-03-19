package com.mypackage;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    
    private static double interestRate = 3.5;
    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accountHolder + " deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

   
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(accountHolder + " withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

  
    public static void setInterestRate(double newRate) {
        interestRate = newRate;
        System.out.println("Updated interest rate to: " + interestRate + "%");
    }

    
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("------------------------------");
    }
}
