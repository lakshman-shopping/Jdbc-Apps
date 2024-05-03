package com.lucky.encapuslation;

public class BankAccount {
       private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) 
	            throws IllegalArgumentException {
		if(balance == 0) 
			throw new IllegalArgumentException(" Do not pass Zero");
		if(balance < 0)
			throw new IllegalArgumentException(" Do not pass negative amount");
		this.balance = balance;
	}
       
       
}
