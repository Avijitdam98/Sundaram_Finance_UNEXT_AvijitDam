package com.abstractclas;

public class Loan {
    public double calculateLoanAmount(Employee employeeObj) {
        if (employeeObj instanceof PermanentEmployee) {
            return 0.15 * employeeObj.salary; 
        } else if (employeeObj instanceof TemporaryEmployee) {
            return 0.10 * employeeObj.salary; 
        }
        return 0;
    }
}
