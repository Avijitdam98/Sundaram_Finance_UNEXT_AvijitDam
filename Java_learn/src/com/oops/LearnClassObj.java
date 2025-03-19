package com.oops;

public class LearnClassObj {

	public static void main(String[] args) {
		
		Dog d1=new Dog();

		d1.nameString="Toomy";
		d1.walk();
		Dog d2=new Dog();
		d2.nameString="mohan";

		d2.bark();
		
		
	}
	

}

class Dog{
	String nameString;
	int age;
	String coloString;
	
	void walk() {
		System.out.println(nameString+" Walking");
	}
	
	void bark() {
		System.out.println(nameString+" Barking");
	}
}




class cat{
	String nameString;
	int age;
	String coloString;
}