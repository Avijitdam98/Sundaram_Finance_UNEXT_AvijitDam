package com.collections;

import java.util.ArrayList;

public class Practice1 {
	public static void main(String[] args) {
		ArrayList<Object> p=new ArrayList<Object>();
		p.add("Java");
		p.add(100);
		p.add(3.14);
		p.add("Spring");
		p.add(true);
		
		
		for (int i = 0; i < p.size(); i++) {
					
			System.out.println(p.getClass());

		}
		System.out.println(p.remove(2));
		System.out.println(p);
	}
	
}
