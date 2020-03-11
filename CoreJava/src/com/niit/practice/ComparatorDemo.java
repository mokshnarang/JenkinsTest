package com.niit.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class ComparatorDemo
{
    public static void main (String[] args)
        {
             ArrayList<Student1> ar = new ArrayList<Student1>();
             ar.add(new Student1(111, "bbbb", "london"));
             ar.add(new Student1(131, "aaaa", "nyc"));
             ar.add(new Student1(121, "cccc", "jaipur"));

             System.out.println("Unsorted");
             for (int i=0; i<ar.size(); i++)
             System.out.println(ar.get(i));

             Collections.sort(ar, new Sortbyroll());

             System.out.println("\nSorted by rollno");
             for (int i=0; i<ar.size(); i++)
             System.out.println(ar.get(i));

             Collections.sort(ar, new Sortbyname());

             System.out.println("\nSorted by name");
             for (int i=0; i<ar.size(); i++)
             System.out.println(ar.get(i));
     }       
}
class Student1
{
    int rollno;
    String name, address;
//Constructor
    public Student1(int rollno, String name, String address)
          {
              this.rollno = rollno;
              this.name = name;
              this.address = address;
          }
//Used to print student details in main()
   public String toString()
         {
              return this.rollno + " " + this.name +
                                 " " + this.address;
        }
 }
class Sortbyroll implements Comparator<Student1>
   {
//Used for sorting in ascending order of roll number
        public int compare(Student1 a, Student1 b)
            {
                return a.rollno - b.rollno;
            }
   }
class Sortbyname implements Comparator<Student1>
  {
//Used for sorting in ascending order of roll name
      public int compare(Student1 a, Student1 b)
           {
                return a.name.compareTo(b.name);
           }
  }