package com.collections;

import java.util.ArrayList;

class Student{
	int id;
	String College;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollege() {
		return College;
	}
	public void setCollege(String college) {
		College = college;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int id, String college, String name) {
		super();
		this.id = id;
		College = college;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", College=" + College + ", name=" + name + "]";
	}
}

public class Generic {

	public static void main(String[] args) {
		ArrayList<Student> Std=new ArrayList<Student>();
		Student s1=new Student(10,"Avijit","UBCG");
		Student s2=new Student(11,"Arijit","SVBM");
		Student s3=new Student(12,"Arjun","Excel");
		Std.add(new Student(14,"Rajesh","Word"));
		
		Std.add(s1);
		Std.add(s2);
		Std.add(s3);
		
		for (int i = 0; i < Std.size(); i++) {
			System.out.println(i);
		}
		
		
		
		
		

		}
		
	}



