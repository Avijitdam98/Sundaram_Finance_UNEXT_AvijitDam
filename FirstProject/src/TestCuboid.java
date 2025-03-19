class Cuboids {
    double l, b, h;

    Cuboids(double length, double breadth, double height) {
        l = length;
        b = breadth;
        h = height;
    }

  
    double volume() {
        return l * b * h;
    }

   
    double volume(double length, double breadth, double height) {
        return length * breadth * height;
    }
}

public class TestCuboid {
    public static void main(String[] args) {
       
        Cuboids c = new Cuboids(5, 4, 3);

 
        System.out.println("Volume using instance variables: " + c.volume());

       
        System.out.println("Volume using method parameters: " + c.volume(7, 6, 5));
    }
}
