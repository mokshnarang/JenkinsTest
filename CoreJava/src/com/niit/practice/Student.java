package com.niit.practice;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {

	int rollno;
	String name;
	int age;
	
	Student(int rollno,String name,int age){
		this.rollno=rollno;
		this .name=name;
		this.age=age;
		
	}
	
	public int compareTo(Student st){
		if(age==st.age)
			return 0;
		
		else if(age>st.age)
		return 1;
		
		else
			return -1;
	}
}

class TestSort3{
	public static void main(String []args){
		{
			ArrayList<Student> a1=new ArrayList<Student>();
			a1.add(new Student(111,"john",29));
			a1.add(new Student(222,"mike",21));
			a1.add(new Student(333,"mary",26));
			
			Collections.sort(a1);
			
			for(Student st:a1){
				System.out.println(st.rollno+""+st.name+" "+st.age);
			}
		}
	}
}
