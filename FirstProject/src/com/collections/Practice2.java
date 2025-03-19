package com.collections;

import java.util.HashSet;

public class Practice2 {
    public static void main(String[] args) {
      
        HashSet<Object> p = new HashSet<>();
        
        
        p.add("Hello");
        p.add(42);
        p.add(3.14);
        p.add(true);
        p.add("World");  

       
        System.out.println("Elements in the set with their types:");
        for (Object element : p) {
            System.out.println(element +  " " + element.getClass().getSimpleName());
        }

        if (p.contains(42)) {
            System.out.println("42 is present");
        }

       
        p.remove("World");

        
        System.out.println("Set after removing 'World': " + p);
    }
}
