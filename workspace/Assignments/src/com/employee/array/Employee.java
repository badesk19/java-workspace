package com.employee.array;		//package name

public class Employee {			//class name

	
	int employeeId;		// fields of employee class
	String employeeName;
	String emailId;
	public Employee() {		//default constructor
	}
	public Employee(int employeeId, String employeeName, String emailId) {	//parameterized constructor
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.emailId = emailId;
	}
	
	public void displayEmployeeInfo()		//display method
	{
		
		System.out.println("Employee Id: "+employeeId);
		System.out.println("Employee Name: "+employeeName);
		System.out.println("EmailId: "+emailId);
		
		
		
	}
	
	
}
