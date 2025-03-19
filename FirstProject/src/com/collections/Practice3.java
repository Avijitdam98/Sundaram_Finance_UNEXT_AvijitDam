package com.collections;

import java.util.ArrayList;

class Product {  
    
    int Pid;
    String Pname;
    int Pid_price;

    public Product(int pid, String pname, int pid_price) {
        this.Pid = pid;
        this.Pname = pname;
        this.Pid_price = pid_price;
    }

    public int getPid_price() {
        return Pid_price;
    }

    @Override
    public String toString() {
        return "Product [Pid=" + Pid + ", Pname=" + Pname + ", Pid_price=" + Pid_price + "]";
    }
}

public class Practice3 {
    public static void main(String[] args) {
        
        ArrayList<Product> pd = new ArrayList<>();

      
        pd.add(new Product(10, "Biscuit", 1000));
        pd.add(new Product(11, "Chocolate", 2000));
        pd.add(new Product(12, "Strawberry", 3000));
        pd.add(new Product(10, "Biscuit", 1000));
        pd.add(new Product(11, "Chocolate", 2000));
        pd.add(new Product(14, "Bakery", 900));
        
        for (Product p : pd) {  
            if (p.getPid_price() > 1000) {
                System.out.println(p);  
            }
        }
    }
}
