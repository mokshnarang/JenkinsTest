package com.niit.practice;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionMethodsDemo {

	public static void main(String[] args) {
		// create list of strings
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("java developers");
		a1.add("friends");
		a1.add("dear");
		a1.add("is");
		a1.add("superb");
		
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("tom");
		a2.add("johny");
		
		Collections.copy(a1,a2);
		System.out.println("after swapping"+a1);
		Collections.sort(a1);
		
		System.out.println("list afterthe use of"+ "Collections.sort(list)" +a1);
		
		int pos=Collections.binarySearch(a1,"superb");
		System.out.println("teh position of superb in alist:"+pos);
		
		Collections.reverse(a1);
		System.out.println("after reversing"+a1);
		
		//Collections.swap(a1,4,1);
		System.out.println("after swapping"+a2);

	}

}
