package com.lucky.nit.suncollection;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();
		
		System.out.println(" Welcome to super marketing ");
		al.add("Rice");
		al.add("Wheat");
		al.add("Biskets");
	    
		for(int i=0; i<al.size(); i++) {
		System.out.println(al.get(i));
		
	}
		

  }
}