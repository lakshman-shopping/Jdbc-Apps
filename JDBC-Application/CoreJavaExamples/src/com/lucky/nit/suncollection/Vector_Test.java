package com.lucky.nit.suncollection;

import java.util.Vector;

public class Vector_Test {

	public static void main(String[] args) {
		Vector<Object> v1 = new Vector<>();
		
		System.out.println("capacity : "+v1.capacity());
		System.out.println("size: " +v1.size());
		System.out.println("Elements: "+v1);
		System.out.println();
		
		v1.add("lakshman");
		v1.add("ram");
		v1.add(12);
		v1.add(5.7);
		v1.add(null);
		
		System.out.println("capacity : "+v1.capacity());
		System.out.println("size: " +v1.size());
		System.out.println("Elements: "+v1);
		System.out.println();
		
		v1.add("ram");
		v1.add(null);
		v1.add(12);
		
		System.out.println("capacity : "+v1.capacity());
		System.out.println("size: " +v1.size());
		System.out.println("Elements: "+v1);
		System.out.println();
		
		Object obj = v1.get(5);
		System.out.println(obj);
		System.out.println();
		
		for(int i=0; i<v1.size(); i++) {
			System.out.println(v1.get(i)+"  ");
		}
	}

}
