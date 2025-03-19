//package com.Collection;
//
//import java.util.*;
//class Person1
//{
//    int id;
//    String name;
//    double salary;
//    public void Person(int id, String name, double salary) {
//        super();
//        this.id = id;
//        this.name = name;
//        this.salary = salary;
//    }
//    public int getId() {
//        return id;
//    }
//    public void setId(int id) {
//        this.id = id;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public double getSalary() {
//        return salary;
//    }
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//    @Override
//    public String toString() {
//        return "Person [id=" + id + ", name=" + name + ", salary=" + salary + "]";
//    }
//
//}
//public class HashMap2 {
//
//    static void displayDetails(Map<Integer,Person> p)
//    {
//        for(Map.Entry<Integer, Person> m:p.entrySet())
//        {
//            System.out.println(m.getKey()+" :"+m.getValue());
//        }
//    }
//    public static void main(String[] args) {
//        Map<Integer,Person> m=new HashMap();
//        Person p1=new Person(10,"ann",7000);
//        Person p2=new Person(11,"bann",17000);
//        Person p3=new Person(12,"kann",27000);
//        m.put(p1.getId(),p1);
//        m.put(p2.getId(),p2);
//        m.put(p3.getId(),p3);
//        displayDetails(m);
//    }}