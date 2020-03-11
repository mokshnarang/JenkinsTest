package com.niit.assignment;

import java.util.*;


public class Marks1
{
   static class SortByMark implements Comparator<Student>
   {
       @Override
       public int compare(Student studentOne, Student studentTwo)
       {
           return studentOne.mark.compareTo(studentTwo.mark);
       }
   }

   static class Student
   {
       private final Double mark;
       private final String name;
       private final int roll_no;
       private final String course;

       public Student(String name,int roll_no,String course, Double mark)
       {
           this.name = name;
           this.roll_no = roll_no;
           this.course= course;
           this.mark = mark;
       }

       public Double getMark()
       {
           return mark;
       }

       public String getName()
       {
           return name;
       }
       public String getCourse(){
        return course;
       }
       public int roll_no(){
        return roll_no;
       }
     
       public String toString()
       {
           return name + ": " + mark + ":"+course +":"+ roll_no;
       }
   }

   private final static SortByMark sortByMark = new SortByMark();;

   public static void main(String args[])
   {
       List<Student> students = new ArrayList<Student>();

       students.add(new Student("moksh",1,"MCA",new Double(110.78)));
       students.add(new Student("amit",2,"BCA", new Double(456.56)));
       students.add(new Student("Any", 3,"BSC",new Double(1767.78)));
       students.add(new Student("many",4,"MSC", new Double(997.22)));
       students.add(new Student("tony",5,"BBA", new Double(9.08)));

       Collections.sort(students, sortByMark);

       for (Student student : students)
       {
           System.out.println(student);
       }
   }
} 