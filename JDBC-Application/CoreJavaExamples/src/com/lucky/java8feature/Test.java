package com.lucky.java8feature;

public class Test {

	public static void main(String[] args) {
		//approch-1
	    Addition ad = new A01();
	    ad.ao(10,20);

	    //apprch-2 by using Anonymous inner class
	    Addition ad2 = new Addition() {
	         public void ao(int a, int b) {
	        	 System.out.println(" Subration : "+a+"..."+b+"--->"+(a-b));
	         }
	    };
	    ad2.ao(30, 50);
	    
	    //approch-3 by using lambda expression
	    Addition ad3 = (int a, int b) ->{
	    	System.out.println("multiple: "+a+"..."+b+"--->"+(a*b));
	    };
	    ad3.ao(9, 8);
	}

}
