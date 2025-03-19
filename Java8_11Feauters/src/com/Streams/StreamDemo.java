package com.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(10,11,12,13,14,15,19);
        long evenCount = l.stream().filter(i -> i % 2 == 0).count();
        System.out.println("Even count: " + evenCount);

        long oddCount = l.stream().filter(i -> i % 2 != 0).count();
        System.out.println("Odd count: " + oddCount);



        long evenCount2 = l.stream().filter(i -> i % 2 == 0).count();
        System.out.println(evenCount2);

        long distinctCount = l.stream().distinct().count();
        System.out.println("Count of distinct elements: " + distinctCount);

        List<String> l2=Arrays.asList("Zen","Ann","Ben","ken");
        l2.stream().map(String::toUpperCase).filter((s)->s.contains("A")).forEach(System.out::println);

        l2.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);  //!Ascending

        l2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);   //*Descending

        int sum = l.stream().reduce(0, (a, b) -> a + b);  System.out.println(sum);

        String[] names={"ann","bann","kann","ren"};
        Stream<String > s=Stream.of(names);
        System.out.println(s.count());


        String[] names1= {"java", "python", "c++", "sql", "html", "css"};
                Stream<String> l21 = Stream.of(names1);
//                boolean allMatch = l21.allMatch(s1 -> s1.contains("e"));System.out.println(allMatch);
                boolean anyMatch = l21.anyMatch(s1 -> s1.contains("c"));System.out.println(anyMatch);
//                boolean noneMatch = l21.noneMatch(s1 -> s1.contains("e"));System.out.println(noneMatch);

        List<String> l3=l2.stream().collect(Collectors.toList());
        System.out.println(l3);



        }






    }
