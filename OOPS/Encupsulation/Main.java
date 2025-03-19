package OOPS.Encupsulation;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("Honda","Civic",2021);
        Car car2=new Car("Honda","Accord",2022);
        car2.copy(car);
        System.out.println(car);
        System.out.println(car2);
        System.out.println("___________");
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println("________________");
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

        car.setYear(2025);
        System.out.println(car.getYear());
    }
}
