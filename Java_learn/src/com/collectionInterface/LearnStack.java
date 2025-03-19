package com.collectionInterface;

import java.util.Stack;

public class LearnStack {

	public static void main(String[] args) {
		Stack<String> animalS=new Stack<String>();
		animalS.push("lion");
		animalS.push("tiger");
		animalS.push("cat");
		animalS.push("dog");
		
		System.out.println("Stack "+animalS);
		System.out.println(animalS.peek());
		
		animalS.pop();
		System.out.println(animalS.peek());
		
	 
	}

}
