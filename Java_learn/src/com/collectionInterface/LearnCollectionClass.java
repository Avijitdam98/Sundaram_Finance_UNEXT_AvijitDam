package com.collectionInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(23);
		list.add(3);
		list.add(9);
		list.add(12);
		list.add(12);
		list.add(8);
		
		System.out.println("Min element "+Collections.min(list));
		System.out.println("Min element "+Collections.max(list));
		System.out.println("Min element "+Collections.frequency(list,12));
		Collections.sort(list,Comparator.reverseOrder());
		System.out.println(list);
		
		
	}

}
