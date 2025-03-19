package com.mypackage;
class Car {
	private String brand;
	private String model;
	private int year;
	// Constructor
	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	// Overriding toString() method
	@Override
	public String toString() {
		return "Car { Brand: " + brand + ", Model: " + model + ", Year: " + year + " }";
	}
}
// Main Class
public class toStirng {
	public static void main(String[] args) {
		// Creating Car objects
		Car car1 = new Car("Toyota", "Camry", 2023);
		Car car2 = new Car("Honda", "Civic", 2022);
		
		System.out.println(car1);
		System.out.println(car2);
	}
}
