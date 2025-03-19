package com.Java8;
import java.util.Optional;
public class OptionalDemo {
    public static void main(String[] args) {
        String name=null;
        Optional<String> s=Optional.ofNullable(name);

        if(s.isPresent())
        {
            System.out.println(s.get());
        }
        else
        {
            System.out.println("not found");
        }

        System.out.println("hello");

    }

}
