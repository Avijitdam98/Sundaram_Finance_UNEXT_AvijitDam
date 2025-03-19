package com.basic;

public class Freind {
    String name;
    static int numberofFreinds;

    Freind(String name){
        this.name = name;
        numberofFreinds++;
    }
    static  void displauFreinds(){
        System.out.println("You have number of freinds "+numberofFreinds++);
    }
}
