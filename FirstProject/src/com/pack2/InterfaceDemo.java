package com.pack2;

interface i1 {
    int x = 10, y = 20;  // Constants (public, static, final by default)
    void add(int a, int b);
    void sub(int a, int b);
}

interface i2 extends i1 {
    void multiply(int a, int b);
}

class Calculator implements i2 {
    public void add(int a, int b) { System.out.println("Addition: " + (a + b)); }
    public void sub(int a, int b) { System.out.println("Subtraction: " + (a - b)); }
    public void multiply(int a, int b) { System.out.println("Multiplication: " + (a * b)); }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        i2 obj = new Calculator();  
        obj.add(i1.x, i1.y);
        obj.sub(50, 30);
        obj.multiply(5, 4);
    }
}
