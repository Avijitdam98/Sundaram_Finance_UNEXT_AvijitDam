package OOPS.Abstraction.Basic;

public class Car extends Vechicle {
    @Override
    void go() {
        System.out.println("Car is moving");
    }

    @Override
    void stop() {
        System.out.println("Car is stopped");
    }
}
