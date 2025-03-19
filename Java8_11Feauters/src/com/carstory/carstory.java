package com.carstory;

public class carstory {
}
class Car {
    private String name;
    private String carName;
    private double price;

    Car(String pName, String cName, double p) {
        this.name = pName;
        this.carName = cName;
        this.price = p;
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
        return carList.stream().mapToDouble(Car::getPrice).sum();
    }

    public List<String> printName(List<Car> carList) {
        return carList.stream().filter(c -> c.getPrice() > 25000).map(c -> c.getName()).collect(Collectors.toList());
    }

    public double maxPrice(List<Car> carList) {
        return carList.stream().mapToDouble(Car::getPrice).max().getAsDouble();
    }
}