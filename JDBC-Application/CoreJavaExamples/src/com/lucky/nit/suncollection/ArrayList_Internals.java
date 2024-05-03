package com.lucky.nit.suncollection;

import java.util.ArrayList;

public class ArrayList_Internals {
      public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();
		System.out.println("size: " + al.size());
		System.out.println("elements " + al);
		System.out.println();
		
		
		// adding object
		al.add("pavan");
		al.add(12);
		al.add("chandu");
		al.add("pavan");
		al.add(34);
		al.add('k');
		al.add(true);
		al.add(new Ex(3,4));
		al.add(null);
		al.add(6.7);
		
		// counting objects
		System.out.println("size: " + al.size());
		// printing objects
		System.out.println("elements " + al);
		System.out.println();
		
		//searching for an object to know whether it is available or not
		
		System.out.println(al.contains("pavan"));//
		System.out.println(al.contains(new String("pavan")));
		System.out.println(al.contains(34));
		System.out.println(al.contains(null));
		System.out.println(al.contains(new Ex(3,4)));
		System.out.println();
		
		//searching for an object to know its index
		System.out.println(al.indexOf("pavan"));
		System.out.println(al.indexOf(true));
		System.out.println(al.indexOf("chandu"));
		System.out.println(al.indexOf(new Ex(3,4)));
		System.out.println(al.indexOf(34));
		System.out.println(al.indexOf("K"));
		System.out.println();
		
		System.out.println(al.lastIndexOf(6.7));
		System.out.println(al.lastIndexOf(true));
		System.out.println(al.lastIndexOf(null));
		System.out.println(al.lastIndexOf("pavan"));
		System.out.println(al.lastIndexOf('k'));
		System.out.println();
		
		//retrieving  an obj from the given index
		
		System.out.println(al.get(2));
		//System.out.println(al.get(12));
	
		//String s1 = al.get(0);   string obj ref as object type because get() return type object
		
		Object obj = al.get(0);
		System.out.println(obj);
		
		String s1 = (String)obj;
		System.out.println(s1.toUpperCase());
		System.out.println();
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i) + " ");
		}
	}
}
