package com.oops;



public class LearnInterfaces {
    public static void main(String[] args) {
        Monkey m = new Monkey();
        m.eats();
        m.walk();
//        int legs=7;;
        System.out.println(Animal.legs);
    }
}

interface Animal {
    int legs=4;
    void eats();
    void drink();

    default  void walk(){
        System.out.println("Animal is walk to much");
    }
}

interface Pet {
    void walk();
    void drink();

}

class Monkey implements Animal, Pet {
    public void eats() {
        System.out.println("Monkey is eating");
    }
    public void drink() {
        System.out.println("I am drinking");
    }

    public void walk() {
        System.out.println("pet is walking");
    }

}
