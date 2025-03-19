package OOPS.Polymorphism.Basic;

public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        Bicycle bicycle=new Bicycle();
        Boat boat=new Boat();
        Vechile[] racers={car,bicycle,boat};
        for (Vechile racer:racers) {
            racer.go();

        }

    }
}
