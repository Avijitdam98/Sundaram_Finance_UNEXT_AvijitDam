package com.collectionInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
		Map<String, Integer> num=new TreeMap<String, Integer>();
//		num.put("One", 1);
//		num.put("Two", 2);
//		num.put("Three", 3);
		
		num.put("Avijit", 101);
		num.put("Rahul", 102);
		num.put("Mukesh", 103);
//		if(!num.containsKey("Two")) {
//			num.put("Avijit", 106);
//		}
		
		for (Map.Entry<String, Integer> entry : num.entrySet()) {
		    String key = entry.getKey();
		    Integer val = entry.getValue();
		    System.out.println(key);
		    System.out.println(val);
		}
		System.out.println(num.containsValue(101));
		System.out.println(num.isEmpty());
		
		System.out.println(num.remove("Avijit", 101));
		
//		System.out.println(num);

	}

}
