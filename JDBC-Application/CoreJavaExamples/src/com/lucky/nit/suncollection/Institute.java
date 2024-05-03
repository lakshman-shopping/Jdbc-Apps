package com.lucky.nit.suncollection;

import java.util.ArrayList;

public class Institute {

	public static void main(String[] args) {
		
	    Student s1 = new Student(100, "pavan", "cj1", 2000);
	    Student s2 = new Student(101, "chandu", "cj1", 2000);
	    Student s3 = new Student(102, "manoj", "cj1", 2000);
	    Student s4 = new Student(103, "raja", "cj1", 2000);
	    Student s5 = new Student(104, "kalyan", "cj1", 2000);
	    
	    Student s6 = new Student(100, "pavan", "cj2", 3000);
	    Student s7 = new Student(101, "kalyan", "cj2", 3000);
	    
	    Student s8 = new Student(100, "chandu", "cj3", 4000);
	    Student s9 = new Student(101, "raja", "cj3", 4000);
	    
	    ArrayList<Student> al = new ArrayList<>();
	    
	    //adding 
	    al.add(s1);
	    al.add(s2);
	    al.add(s3);
	    al.add(s4);
	    al.add(s5);
	    al.add(s6);
	    al.add(s7);
	    al.add(s8);
	    al.add(s9);
	    
	    //counting
	    System.out.println(al.size());
	    
	    //printing
	    System.out.println(al);
	    System.out.println();
	    //searching to know whether this student object is exist or not
	    if(al.contains(new Student(100, "pavan", "cj2", 0))) {
	    	System.out.println("Student is found");
	    }
	    else {
	    	System.out.println("Student is not found");
	    }
	    //retrieving student object
	    int index = al.indexOf(new Student(100, "cj2"));
	    if(index>=0) {
	    	Student student = al.get(index);
	    	System.out.println("Fee paid for the course "+ student.getCourse()+ " is " + student.getFee());
	    }
	    else {
	    	System.out.println("Student is not found");
	    }
	    
	    //retrieving student object is given index 
	    al.remove(s6);
	    al.remove(s7);
	    System.out.println(al);
	    
	    al.remove(s2);
	    System.out.println(al);
	}
	

}
