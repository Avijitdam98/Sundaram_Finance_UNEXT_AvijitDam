public class Cuboid1 {
    
    int l, b;
    
    // Constructor with int parameters
    Cuboid1(int p, int q) {
        l = p;
        b = q;
    }

    // Overloaded constructor with double parameters (Type Casting)
    Cuboid1(double p, double q) {
        l = (int) p;  // Explicitly casting double to int
        b = (int) q;
    }

    // Method to calculate volume
    void volume() {
        System.out.println("Area: " + (l * b));
    }

    public static void main(String[] args) {
        // Calling constructor with int parameters
        Cuboid1 obj1 = new Cuboid1(2, 3);
        obj1.volume();  // Output: Area: 6

        // Calling constructor with double parameters
        Cuboid1 obj2 = new Cuboid1(2.5, 3.8);
        obj2.volume();  // Output: Area: 6 (due to type casting)
    }
}
