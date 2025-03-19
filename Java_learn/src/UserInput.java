import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is your name?");
        String name = sc.nextLine();
        
        System.out.println("What is your age?");
        int age = sc.nextInt();
        sc.nextLine(); 
        
        System.out.println("What is your favorite food?");
        String food = sc.nextLine();
        
        System.out.println("My name is " + name + ", my age is " + age + ", and my favorite food is " + food);
        
        sc.close();
    }
}
