package com.collectionInterface;

import java.util.ArrayDeque;

public class LearnArrayqueue {
	public static void main(String[] args) {
		ArrayDeque<Integer>adq=new ArrayDeque<Integer>();
		adq.offer(25);
		adq.offerFirst(12);
		adq.offerLast(23);
		System.out.println(adq);
		
		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		System.out.println(adq.pollLast());
		
		
	}
}
