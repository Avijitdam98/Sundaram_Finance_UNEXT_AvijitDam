package com.pack2;

class Example {  
    final int value;  

    Example(int val) {
        value = val;  
    }

    void display() {
        System.out.println("Final value: " + value);
    }
}

public class finalkeyword {  
    public static void main(String[] args) {
        Example obj = new Example(100);
        obj.display();
        
         obj.value = 200;  // 
    }
}
