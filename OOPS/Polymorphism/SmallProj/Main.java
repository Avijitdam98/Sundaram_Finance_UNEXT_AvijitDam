package OOPS.Polymorphism.SmallProj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Human human;
        System.out.println("Which character you want?");
        System.out.println("Enter 1 for Boy, 2 for Girl or any other key for Human: ");
        int choice=scanner.nextInt();
        if(choice==1){
            human=new Boy();
            human.gender();
        }else if(choice==2){
            human=new Girl();
            human.gender();
        }else{
            human=new Human();
            human.gender();
        }

    }
}
