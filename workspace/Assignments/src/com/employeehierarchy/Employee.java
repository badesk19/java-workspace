/*Create a class hierarchy:  Employee
                             Manager
                             SalesManager
 Override calculateSalary() method. Manager  will have allowance field &
SalesManager will have  commission field.*/


package com.employeehierarchy; // package name

public class Employee {		//class name
	int employeeId;
	String employeeName;
	String emailId;
	double salary;
	
	
	public Employee(int employeeId, String employeeName, String emailId,
			double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.emailId = emailId;
		this.salary = salary;
	}

	public double calculateSalary()
	{
		return salary;
	}
	

	public void displayEmployeeInfo()
	{
		
		System.out.println("Employee Id: "+employeeId);
		System.out.println("Employee Name: "+employeeName);
		System.out.println("EmailId: "+emailId);
		System.out.println("Salary: "+salary);
		
		
		
	}
	
}

class Manager extends Employee			// class name
{
	double allowance;
	public Manager(int employeeId, String employeeName, String emailId,
			double salary,double allowance) {
		super(employeeId, employeeName, emailId, salary);
		this.allowance=allowance;
	}
	 
	@Override
	public double calculateSalary() {  //override calculateSalary method
		// TODO Auto-generated method stub
		return salary+allowance;
	}

	@Override
	public void displayEmployeeInfo() {
		System.out.println("Employee Id: "+employeeId);
		System.out.println("Employee Name: "+employeeName);
		System.out.println("EmailId: "+emailId);
		System.out.println("Salary: "+calculateSalary());
		
		
	}
}

class SalesManager extends Employee		//class name
{
	double commission; 
	
	public SalesManager(int employeeId, String employeeName, String emailId,
			double salary, double commission) {
		super(employeeId, employeeName, emailId, salary);
		this.commission = commission;
	}

	@Override
	public double calculateSalary() {		//override calculateSalary method
		// TODO Auto-generated method stub
		return salary+commission;
	}
	@Override
	
	public void displayEmployeeInfo() {
		System.out.println("Employee Id: "+employeeId);
		System.out.println("Employee Name: "+employeeName);
		System.out.println("EmailId: "+emailId);
		System.out.println("Salary: "+calculateSalary());
		
		
	}
}

