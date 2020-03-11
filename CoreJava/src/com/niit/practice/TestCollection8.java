package com.niit.practice;
import java.util.*;
public class TestCollection8 {

	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("jim");
		al.add("jerry");
		al.add("john");
		al.add("jive");
		System.out.println("element at 2nd position:"+al.get(2));
		
		ListIterator<String> itr=al.listIterator(al.size());
		/*System.out.println("travelling elements in following direction");
		
		while(itr.hasNext()){
		System.out.println(itr.next());
		}*/
		
		System.out.println("backward");
		
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
	}
}
