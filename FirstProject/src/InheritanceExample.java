//! Parent class (Super class)
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Child class (Sub class)
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Creating an instance of Dog
        myDog.name = "Buddy"; // Inherited variable from Animal class
        myDog.eat(); // Inherited method
        myDog.bark();
    }
}
