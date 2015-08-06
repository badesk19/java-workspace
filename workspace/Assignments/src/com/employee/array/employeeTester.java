package com.employee.array;



public class employeeTester {		//employee tester class
public static void main(String args[]) {		//main method
		
	Employee employeeArray[]=new Employee[3];			//array of employee
	
	employeeArray[0]=new Employee(1,"Roy","roy@cybage.com");	//initialization of objects
	
	employeeArray[1]=new Employee(2,"John","john@cybage.com");
	employeeArray[2]=new Employee(3,"Raj","raj@cybage.com");
	
	
	for(int i=0;i<employeeArray.length;i++)
	{
		
		employeeArray[i].displayEmployeeInfo();		//calling display method
		
	}
		
	
	
	
		
	}
	
}
