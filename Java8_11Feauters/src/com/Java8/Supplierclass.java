package com.Java8;

import java.util.function.Consumer;

public class Supplierclass {
    public static void main(String[] args) {

        Consumer<String> printConsumer = message -> System.out.println("Message: " + message);

        printConsumer.accept("Hello, Java!");
        printConsumer.accept("Functional Interface Example");
    }
}
