package OOPS.Polymorphism.Dynamic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Animal animal;
        System.out.println("What animal do you want?");
        System.out.println("1.Cat\n2.Dog\n3.Animal");
        int choice=scanner.nextInt();
        if(choice==1) {
            animal = new Dog();
            animal.speak();
        }
        else if(choice==2) {
            animal = new Cat();
            animal.speak();
        }
        else if(choice==3) {
            animal = new Animal();
            animal.speak();
        }
    }
}
