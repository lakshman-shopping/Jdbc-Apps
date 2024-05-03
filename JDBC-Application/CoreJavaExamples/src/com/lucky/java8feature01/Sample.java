package com.lucky.java8feature01;

public class Sample implements Example {

	@Override
	public void m1() {
		System.out.println(" sample m1 is exceuted ");

	}
   @Override
	public void m2() {
		System.out.println(" sample m2 is exceuted ");
		//super.m2();
		Example.super.m2();
		System.out.println();
		 /*Also it is introduced to for stop inheriting into implementation classes and 
			forcing the implementation classes and user classes to access its logic by using interface name.*/
		Example.m3();
	}
   
 
}
