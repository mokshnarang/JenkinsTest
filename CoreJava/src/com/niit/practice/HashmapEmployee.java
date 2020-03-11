package com.niit.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;
import java.util.TreeMap;

public class HashmapEmployee {

	public static void main(String[] args) {
		
		TreeMap hsh = new TreeMap();
		
		 hsh.put("a1234","steve jobs");
		 hsh.put("a1235","scott");
		 hsh.put("a1236","jeff");
		 hsh.put("a1237","larry");
		 hsh.put("a1238",null);
		 
		 Set set = hsh.entrySet();
		 
		 Iterator i = set.iterator();
		 
		 Scanner sc1 = new Scanner(System.in);
			String a1=sc1.next();
			
			System.out.println(hsh.get(a1));
			
			
		 while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	}
	}

}
