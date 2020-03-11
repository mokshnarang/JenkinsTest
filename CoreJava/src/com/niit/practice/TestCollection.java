package com.niit.practice;

import java.util.*;
public class TestCollection {

	public static void main(String[] args){
		
		PriorityQueue<String> queue=new PriorityQueue<String>();
		
		queue.add("john");
		queue.add("jim");
		queue.add("mary");
		queue.add("jed");
		queue.add("aul");
		
		System.out.println("head" +queue.element());
		System.out.println("head" +queue.peek());
		System.out.println("iterating the queue elements");
		
		Iterator itr=queue.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("after removing 2 elements");
		
		Iterator<String> itr2=queue.iterator();
		
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
		
	}
}
