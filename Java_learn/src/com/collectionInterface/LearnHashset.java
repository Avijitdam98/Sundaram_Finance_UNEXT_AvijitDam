package com.collectionInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnHashset {

	public static void main(String[] args) {
		Set<Student> studentSet=new HashSet<Student>();
		//Set<Integer> set= new HashSet<Integer>();
//		Set<Integer> set= new LinkedHashSet<Integer>();
//		Set<Integer>set=new TreeSet<Integer>();
//		set.add(32);
//		set.add(45);
//		set.add(48);
//		set.add(67);
//		set.add(89);
//		set.add(89);
//		System.out.println(set);
//		System.out.println(set);
//		set.remove(89);
//		System.out.println(set);
//		System.out.println(set.contains(100));
//		System.out.println(set.isEmpty());
//		System.out.println(set.size());
//		
		studentSet.add(new Student("Avijit", 10));
		studentSet.add(new Student("Rahul", 22));
		studentSet.add(new Student("Mainak", 12));
		studentSet.add(new Student("Rajesh", 32));
		studentSet.add(new Student("Avijit", 10));
		System.out.println(studentSet);
		

	}

}
