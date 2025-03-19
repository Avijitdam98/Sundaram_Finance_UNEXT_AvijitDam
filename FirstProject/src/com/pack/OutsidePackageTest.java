package com.pack;

// Importing the public class from another package
import com.pack.AccessModifiersExample;

public class OutsidePackageTest {
    public static void main(String[] args) {
        AccessModifiersExample obj = new AccessModifiersExample();

        // Accessing public members
        System.out.println("Public Variable: " + obj.publicVar);  // Allowed
        obj.publicMethod();  // Allowed

    }
}
