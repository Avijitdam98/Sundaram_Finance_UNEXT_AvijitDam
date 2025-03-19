package com.abstractclas;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loan loanCalculator = new Loan();

       
        System.out.print("Enter Permanent Employee ID: ");
        int pId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Name: ");
        String pName = scanner.nextLine();
        System.out.print("Enter Basic Pay: ");
        double basicPay = scanner.nextDouble();
        
        PermanentEmployee pEmp = new PermanentEmployee(pId, pName, basicPay);
        pEmp.calculateSalary();
        pEmp.displayDetails();
        System.out.println("Loan Amount: $" + loanCalculator.calculateLoanAmount(pEmp));
        System.out.println("---------------------------");


        System.out.print("Enter Temporary Employee ID: ");
        int tId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Name: ");
        String tName = scanner.nextLine();
        System.out.print("Enter Hours Worked: ");
        int hoursWorked = scanner.nextInt();
        System.out.print("Enter Hourly Wages: ");
        int hourlyWages = scanner.nextInt();
        
        TemporaryEmployee tEmp = new TemporaryEmployee(tId, tName, hoursWorked, hourlyWages);
        tEmp.calculateSalary();
        tEmp.displayDetails();
        System.out.println("Loan Amount: $" + loanCalculator.calculateLoanAmount(tEmp));

        scanner.close();
    }
}
