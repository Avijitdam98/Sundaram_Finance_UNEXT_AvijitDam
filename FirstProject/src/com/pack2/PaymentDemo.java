package com.pack2;


interface Payment {
    void processPayment(double amount);
    String getPaymentMethod();
}


class CreditCardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }

    public String getPaymentMethod() {
        return "Credit Card";
    }
}


class PayPalPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }

    public String getPaymentMethod() {
        return "PayPal";
    }
}


class BankTransferPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer payment of $" + amount);
    }

    public String getPaymentMethod() {
        return "Bank Transfer";
    }
}


public class PaymentDemo {
    
    static void processTransaction(Payment payment, double amount) {
        System.out.println("Payment Method: " + payment.getPaymentMethod());
        payment.processPayment(amount);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        
        Payment ccPayment = new CreditCardPayment();
        Payment paypalPayment = new PayPalPayment();
        Payment bankPayment = new BankTransferPayment();

     
        processTransaction(ccPayment, 100.0);
        processTransaction(paypalPayment, 200.5);
        processTransaction(bankPayment, 500.75);
    }
}
