package com.collectionInterface;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LearnArraysClass {

	public static void main(String[] args) {
		int [] numbers= {1,4,5,10,2,34,54,21,7};
		Arrays.sort(numbers);
		
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			
		}

	}

}
