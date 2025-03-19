package com.pack2;

public class StringClass {
    public static void main(String[] args) {
        String s = " Hello ";  
        String s1 = "Welcome";

        
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("World");
        System.out.println(sb);  

        // Converting StringBuffer to String before performing String operations
        String a = sb.toString().toUpperCase();
        System.out.println(a);  // Output: HELLOWORLD

        // Performing various String operations
        System.out.println(a.charAt(0));            
        System.out.println(a.concat("Avi"));        
        System.out.println(a.replace("HELLO", "HI")); // Output: HIWORLD
        System.out.println(a.contains("EL"));       // Output: true
        System.out.println(a.indexOf("H"));         // Output: 0
        System.out.println(a.equals(s1));           // Output: false
        System.out.println(s.trim());               // Output: Hello (removes spaces from " Hello ")
        System.out.println(a.endsWith("O"));        // Output: false (because it's HELLOWORLD)
    }
}
