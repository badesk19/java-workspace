package com.multithreading;

public class Account {
	private int balance=5000;  
	  
    
	
	
    public Account() {
	}




	public Account(int balance) {
		this.balance = balance;
	}




	public int getBalance() {
		return balance;
	}




	public void setBalance(int balance) {
		this.balance = balance;
	}




	public void withdrawMoney(int amount) {  
  
    balance = balance - amount;  
  
    }  
  
}
