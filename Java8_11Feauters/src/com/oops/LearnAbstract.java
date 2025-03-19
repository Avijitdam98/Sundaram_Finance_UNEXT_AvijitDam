package com.oops;

public class LearnAbstract {
    public static void main(String[] args) {
   // Vechile v1=new Vechile();
        car c=new car();
        c.accelerate();
        c.breaks(4);
        c.honks();
        scooter s=new scooter();
        s.accelerate();
        s.breaks(6);
    }
}
abstract class human{
    void  speak(){}
   abstract void eat();
}
abstract class Vechile{
    abstract  void accelerate();
    abstract  void breaks(int wheels);
    abstract void engine();
    abstract void pattern();
    void honks(){
        System.out.println("Vechile Honks");
    }
}

class scooter extends Vechile{
    void accelerate() {
        System.out.println("Scooter start");
    }
    void breaks(int wheels) {
        System.out.println("Scooter break");
    }
    void engine() {

    }
    void pattern() {

    }
}

 class car extends Vechile{
     void accelerate() {
         System.out.println("Car is accelrating");
     }
     void breaks(int wheels) {
         System.out.println("car breaks are pushed");
    return;
     }
     void engine() {
     }
     void pattern() {
     }

     void honks(){
         System.out.println("car is honks");
     }
 }
