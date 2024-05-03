package com.lucky.java8feature01;

public class Test01 {

	public static void main(String[] args) {
		//Example ex = new Example();
		//ex.m2();
		
		Example ex1 = new Sample();
		ex1.m2();
		ex1.m1();
		System.out.println();
		//Example ex2 = new Sample();
		//ex2.m3();
		/*In an interface static implemented method is introduced 
		for developing logic common to all its implementation classes
		and also common to all its user classes to execute this logic
		directly by using interface reference (only by using interface name).*/
	
		Example.m3();
	}
    
}
