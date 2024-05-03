package com.lucky.encapuslation;

import java.util.Scanner;
import java.util.InputMismatchException;
public class bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		BankAccount acc1 = new BankAccount();
		
		while(true){
			try {
				System.out.println("\nEnter Balance: ");
				double balance = sc.nextDouble();  
				    sc.nextLine();
				    acc1.setBalance(balance);
				    System.out.println(" Current Balance: " + acc1.getBalance());
				    break;
				
			}catch(InputMismatchException e) {
				System.out.println(" Enter only Number ");
				sc.nextLine();
				
			}catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
