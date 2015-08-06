package com.employeehierarchy; //package name

public class EmployeeTester {		//class name

	public static void main(String[] args) {  //main method
		
		
		Employee employeeObject=new Employee(1, "John", "john@gmail.com", 1000);
		employeeObject.displayEmployeeInfo();
		Manager managerObject=new Manager(2, "Shawn", "shawn@cybage.com", 1000, 200);
		managerObject.displayEmployeeInfo();
		SalesManager salesManagerObject=new SalesManager(3, "Shawn", "shawn@cybage.com", 1000, 400);
		salesManagerObject.displayEmployeeInfo();
	

	}

}
