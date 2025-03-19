package com.Collection;

class VarargsDemo {
    static void showDetails(String name, int... marks) {
        System.out.println("Name: " + name);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        showDetails("Alice", 85, 90, 95);
        showDetails("Bob", 78, 80);
        showDetails("Charlie"); // No marks provided
    }
}
