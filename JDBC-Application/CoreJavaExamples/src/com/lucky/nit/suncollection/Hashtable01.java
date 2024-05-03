package com.lucky.nit.suncollection;

import java.util.Hashtable;

public class Hashtable01 {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		
        ht.put(4, "A");
        ht.put(7, "B");
        ht.put(12, "D");
        ht.put(new Temp(14), "E");
        ht.put(23, "C");
        
        System.out.print(ht);
       
	}

}
