package com.bank;

public class BankTester {

	public static void main(String args[])
	{
	BankAccount bankObject=new Saving("Sagar", "Pune", 5000, 5);
	System.out.println("Total Amount(Saving Account)="+bankObject.calculateTotalAmount(bankObject.getBalance()));
	BankAccount bankObject1=new Current("Jatin", "Pune", 5000, 5);
	System.out.println("Total Amount(Current Account)="+bankObject1.calculateTotalAmount(bankObject.getBalance()));
	
	}
	
	
}
