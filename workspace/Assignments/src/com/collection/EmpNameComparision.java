package com.collection;

import java.util.Comparator;

public class EmpNameComparision implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		 return emp1.getEmployeeName().compareTo(emp2.getEmployeeName());
	}

}
