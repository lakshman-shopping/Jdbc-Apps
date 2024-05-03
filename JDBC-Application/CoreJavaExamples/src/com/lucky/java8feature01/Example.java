package com.lucky.java8feature01;

public interface Example {
      void m1();
      default void m2() {
    	  System.out.println(" Example m2 is exceuted ");
      }
      static void m3() {
    	  System.out.println(" Example m3 is exceuted ");// From Java 8v onwards in addition to default methods we can also create 
    		//static implemented methods common to all implementation classes of this interface
      }
}
