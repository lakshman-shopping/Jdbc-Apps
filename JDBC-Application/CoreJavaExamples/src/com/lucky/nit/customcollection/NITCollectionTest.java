package com.lucky.nit.customcollection;

public class NITCollectionTest {
       public static void main(String[] args) {
		
    	   NITCollection nc = new NITCollection();
   	
    	   System.out.println(nc.capacity());
    	   System.out.println(nc.size());
    	   System.out.println(nc);
    	  
    	   
    	   nc.add("HI");          System.out.println(nc);
    	   nc.add("Hello");          System.out.println(nc);
    	   nc.add("HRU?");          System.out.println(nc);
    	   nc.add("Fine");          System.out.println(nc);
    	   nc.add("U");          System.out.println(nc);
    	   nc.add("U");          System.out.println(nc);
    	   nc.add("What are U doing?");          System.out.println(nc);
    	   nc.add("software");          System.out.println(nc);
    	   nc.add("57000");          System.out.println(nc);
    	   nc.add("HCL");          System.out.println(nc);
    	   nc.add("54");          System.out.println(nc);
    	   System.out.println(nc.capacity());
    	   System.out.println(nc.size());
	}
}
