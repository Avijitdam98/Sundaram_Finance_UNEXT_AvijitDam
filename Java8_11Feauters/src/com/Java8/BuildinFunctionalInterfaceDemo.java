package com.Java8;
import java.util.function.Function;

public class BuildinFunctionalInterfaceDemo {
    public static void main(String[] args) {

        Function<String, Integer> f = String::length; //(String s) -> s.length()
    }
}
