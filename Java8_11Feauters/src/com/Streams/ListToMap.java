package com.Streams;

import java.util.*;
import java.util.stream.Collectors;

class Empl {
    int id;
    String name;

    Empl(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class ListToMap {
    public static void main(String[] args) {
        List<Empl> employees = Arrays.asList(
                new Empl(1, "John"),
                new Empl(2, "Jane"),
                new Empl(3, "Jack")
        );

        Map<Integer, String> employeeMap = employees.stream()
                .collect(Collectors.toMap(emp -> emp.id, emp -> emp.name));

        System.out.println(employeeMap);

        List<Integer> l4 = Arrays.asList(4, 5, 6, 7, 8, 9);
        Optional<Integer> o = l4.stream().findAny();
        if (o.isPresent()) {
            System.out.println(o.get());
        }

        if (o.isPresent()) {
            System.out.println(o.stream().max(Comparator.comparingInt(a -> a)).get());
            System.out.println(o.stream().min(Comparator.comparingInt(a -> a)).get());
        }
    }
}