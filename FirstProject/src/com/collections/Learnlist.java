package com.collections;

import java.util.ArrayList;
import java.util.Iterator;



public class Learnlist {

	public static void main(String[] args) {
		ArrayList<Object> p=new ArrayList<Object>();
		
		p.add(20);
		p.add(25);
		p.add(34);
		p.add(45);
		p.add("Avijit");
		p.set(1,"Arjun");
		
		System.out.println(p);
		System.out.println(p.contains(20));
		System.out.println(p.getFirst());
		System.out.println(p.hashCode());
		System.out.println(p.removeFirst());
		System.out.println(p.getLast());
		System.out.println(p.contains("Arjun"));
		System.out.println(p.clone());
		System.out.println(p.get(2));
		for (int i = 0; i < p.size(); i++) {
			System.out.println(p.get(i));	
		}
		System.out.println();
		
		Iterator i1=p.iterator();
		while(i1.hasNext()) {
			Object o=i1.next();
			System.out.println(o);
		}
		
				
		
		
	}

}
