package com.pack; // Define package

public class AccessModifiersExample {  
    
    public int publicVar = 10;  
    private int privateVar = 20;  
    int defaultVar = 30;  
    
    public void publicMethod() {
        System.out.println("Public Method: Accessible anywhere");
    }

   
    private void privateMethod() {
        System.out.println("Private Method: Accessible only in this class");
    }


    void defaultMethod() {
        System.out.println("Default Method: Accessible within the same package");
    }

   
    public void accessPrivateMethod() {
        System.out.println("Accessing private method inside the same class:");
        privateMethod();  // Allowed (Because it's within the same class)
    }
}
