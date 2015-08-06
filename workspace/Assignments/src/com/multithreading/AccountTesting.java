package com.multithreading;

public class AccountTesting implements Runnable {

	 Account acc = new Account();  
	  
	@Override
	public void run() {
		for (int k = 0; k < 5; k++) {  
			
			withdrawlMoney(200);  
  
      
  
		
	}
		
		
		}

	private void withdrawlMoney(int amount) {
		if (acc.getBalance() >= amount) {  
			  
            System.out.println(Thread.currentThread().getName() + " has started withdrawing");  
  
            try {  
  
                Thread.sleep(200);  
  
            } catch (InterruptedException ex) {  
  
            }  
  
            acc.withdrawMoney(amount);  
  
            System.out.println(Thread.currentThread().getName() + " has completed the withdrawal");  
  
        } else {  
  
            System.out.println("Insufficient fund ");  
  
        }  
  
		
	}

}
