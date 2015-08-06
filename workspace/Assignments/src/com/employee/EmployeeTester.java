package com.employee;

public class EmployeeTester {

	public static void main(String args[]) {
		
		Employee empObject1=new Employee();
		empObject1.setEmployeeId(1);
		empObject1.setEmployeeName("Shawn");
		empObject1.setEmailId("shwan@cybage.com");
		empObject1.displayEmployeeInfo();
		
		Employee empObject2=new Employee();
		empObject2.setEmployeeId(2);
		empObject2.setEmployeeName("Sagar");
		empObject2.setEmailId("sagar@cybage.com");
		empObject2.displayEmployeeInfo();
		
	}
	
}
