public class MethodOverload {

    // Method with one String parameter (Student ID)
    void add(String a) {
        System.out.println("Student ID: " + a);
    }

   // (Student ID and Name)
    void add(String a, String b) { 
        System.out.println("Student ID: " + a + ", Name: " + b);
    }

    // Overloaded method with double, String, and String (Student ID, Name, Course)
    void add(String a, String b, String c) { 
        System.out.println("Student ID: " + a + ", Name: " + b + ", Course: " + c);
    }

    public static void main(String[] args) {
        MethodOverload obj = new MethodOverload();

       
        obj.add("102");                 
        obj.add("102", "Avijit");        
        obj.add("102", "Avijit", "Java"); 
    }
}
