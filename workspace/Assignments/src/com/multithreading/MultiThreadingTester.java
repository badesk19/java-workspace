package com.multithreading;

public class MultiThreadingTester {

	public static void main(String[] args) {
		 
		AccountTesting accTest=new AccountTesting();
		Thread th1=new Thread(accTest);
		Thread th2=new Thread(accTest);
		th1.setName("Holder 1");
		th2.setName("Holder 2");
		th1.start();
		th2.start();
	}

}
