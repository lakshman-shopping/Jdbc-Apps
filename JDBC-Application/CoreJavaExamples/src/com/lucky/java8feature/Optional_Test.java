package com.lucky.java8feature;

import java.util.Optional;

public class Optional_Test {

	public static void main(String[] args) {
		String[] s = new String[5];
		s[0] = "lakshman";
		s[1] = "ram";
		
		System.out.println( s[0].toUpperCase());
		//System.out.println(s[2].toUpperCase());   //NullPointerException
       //System.out.println(s[2]);
       
       Optional<String> o = Optional.ofNullable(s[3]);
       System.out.println(o.isPresent());
       if(o.isPresent()) {
    	   System.out.println("value is existed.."+o.get()+"..."+o.get().toUpperCase());
       }else {
    	   System.out.println("value is not existed ");
         }
      }

}
