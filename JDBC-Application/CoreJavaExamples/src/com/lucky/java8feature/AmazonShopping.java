package com.lucky.java8feature;
interface  AmazonShopping {
      public abstract void productOrder();
      public abstract void productDelivery();
      public default  void OnlinePayment() {
    	  System.out.println("online payment is completed");
      }
    	  //default void CashOnDelivery();
      
}
