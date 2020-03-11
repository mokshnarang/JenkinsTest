/*It's time to gather in the harvest. Let's create a HashSet with
String elements. And here are the ten strings that we'll add to it:
watermelon, banana, cherry, pear, cantaloupe, blackberry, ginseng, strawberry,
iris, potato. Then we'll display the contents of the collection, and observe the 
order of the collection entries.*/ 
 

package com.niit.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPlants {

	public static void main(String[] args) {
		
		Set<String> fruits = new HashSet<>();
		
		fruits.add("watermelon");
		fruits.add("banana");
		fruits.add("cherry");
		fruits.add("pear");
		fruits.add("cantaloupe");
		fruits.add("blackberry");
		fruits.add("ginseng");
		fruits.add("strawberry");
		fruits.add("iris");
		fruits.add("potato");
		
		Iterator<String> iterator = fruits.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
}
