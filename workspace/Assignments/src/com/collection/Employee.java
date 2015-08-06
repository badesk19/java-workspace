
package com.collection;

public class Employee {
	
	int employeeId;
	String employeeName;
	String emailId;
	
	public Employee() {
	}
	
	
	public Employee(int employeeId, String employeeName, String emailId) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.emailId = emailId;
	}


	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	@Override
	public String toString()
	{
		String s="Employee Id="+employeeId+"Employee Name="+employeeName+"Email Id="+emailId;
		return s;

	}
	
	

}
