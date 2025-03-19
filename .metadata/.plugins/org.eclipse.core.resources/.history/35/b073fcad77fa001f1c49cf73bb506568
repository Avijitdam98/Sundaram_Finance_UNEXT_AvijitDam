import java.util.Scanner; 

class Person {
    int id;
    String name; 
    double salary;

   
    //constructor 
    Person(int i, String n, double d) {
        id = i;
        name = n;
        salary = d;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Person p = new Person(id, name, salary);

 
        System.out.println("\nPerson Details:");
        p.display();

        
    }
}
