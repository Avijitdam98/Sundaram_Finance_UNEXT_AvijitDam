package Task.CarStory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Car {
    private String name;
    private String carName;
    private double price;

    public Car(String name, String carName, double price) {
        this.name = name;
        this.carName = carName;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class CarImplementation {
    public double sumOfPrices(List<Car> carList) {
        return carList.stream()
                .map(Car::getPrice)
                .reduce(0.0, Double::sum);
    }

    public List<String> printName(List<Car> carList) {
        return carList.stream()
                .filter(car -> car.getPrice() > 25000)
                .map(Car::getCarName)
                .collect(Collectors.toList());
    }

    public double maxPrice(List<Car> carList) {
        return carList.stream()
                .map(Car::getPrice)
                .max(Double::compareTo)
                .orElse(0.0);
    }
}

public class CarStory {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Brand1", "Alfa Romeo", 30000));
        carList.add(new Car("Brand2", "Bugatti", 50000));
        carList.add(new Car("Brand3", "Chrysler", 40000));
        carList.add(new Car("Brand4", "Dodge", 60000));
        carList.add(new Car("Brand5", "Essen", 910000));

        CarImplementation carImpl = new CarImplementation();

        System.out.println(carImpl.sumOfPrices(carList));
        System.out.println(carImpl.printName(carList));
        System.out.println(carImpl.maxPrice(carList));
    }
}
