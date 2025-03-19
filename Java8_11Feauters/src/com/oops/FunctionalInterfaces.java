package com.oops;

public class FunctionalInterfaces {

    public static void main(String[] args) {
        SuperInterface superInterface = () -> System.out.println("Executing interfaceMethod");
        Walkable walkable = steps -> {
            System.out.println("Walking " + steps + " steps");
            return steps;
        };

        superInterface.interfaceMethod();
        walkable.walk(10);
    }
}

@FunctionalInterface
interface SuperInterface {
    void interfaceMethod();
}

interface Walkable {
    int walk(int steps);
}