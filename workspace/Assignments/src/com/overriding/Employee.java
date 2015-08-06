/*Override equals(),toString() in Employee class*/

package com.overriding;

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
	
	@Override
	public boolean equals(Object obj)
	{
		Employee emp=(Employee)obj;
		if(this.employeeId==emp.getEmployeeId()&&this.employeeName==emp.getEmployeeName()&&this.emailId==emp.emailId)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		int hashCode = 10;
		hashCode =  10* hashCode + this.emailId.hashCode();
		hashCode = 10 * hashCode + this.employeeName.hashCode();
		return hashCode;
	}
	
	
}
