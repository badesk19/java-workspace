package com.overriding;

public class OverridingTester {

	public static void main(String args[])
	{
		Employee emp=new Employee(1, "Sagar", "sagar@cybage.com");
		System.out.println(emp);
		Employee emp1=new Employee(1, "Pankaj", "pankaj@cybage.com");
		System.out.println(emp1.equals(emp));
		System.out.println("Employee 1 hashcode="+emp.hashCode());
		System.out.println("Employee 2 hashcode="+emp1.hashCode());
		
		Account acc=new Account("Tom","Pune");
		Account acc1=new Account("Pankaj","Pune");
		System.out.println(acc);
		System.out.println(acc.equals(acc1));
		
		
	}
	
}
