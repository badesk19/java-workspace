/*Create a sorted set of Employee objects.(Sort on Emp ID)*/
/*Create a list of Employee objects & sort them by names in alphabetical order (may be same as above.)*/
package com.collection;

import java.util.TreeSet;

public class EmployeeCollection {
public static void main(String args[])
{


	Employee emp1=new Employee(1, "sanket", "sanket@cybage.com");
	Employee emp2=new Employee(12,"Anuj","anuj@cybage.com");
	Employee emp3=new Employee(7,"Anuj","anuj@cybage.com");
	Employee emp4=new Employee(8,"Anuj","anuj@cybage.com");
	  TreeSet<Employee> employeeSet = new TreeSet<Employee>(new EmpIdComparision());
	  employeeSet.add(emp1);
	  employeeSet.add(emp2);
	 employeeSet.add(emp3);
	 employeeSet.add(emp4);
	 for(Employee emp:employeeSet)
	 {
	 System.out.println(emp);
	 }
	 
	 TreeSet<Employee> employeeSet1 = new TreeSet<Employee>(new EmpNameComparision());
	  employeeSet1.add(emp1);
	  employeeSet1.add(emp2);
	 employeeSet1.add(emp3);
	 employeeSet1.add(emp4);
	 for(Employee emp:employeeSet1)
	 {
	 System.out.println(emp);
	 }
	
	

}
}
