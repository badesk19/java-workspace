package com.collection;

import java.util.Comparator;

public class EmpIdComparision implements Comparator<Employee> {

	 @Override
	    public int compare(Employee emp1, Employee emp2) {
		 if(emp1.getEmployeeId() > emp2.getEmployeeId()){
	            return 1;
	        } else {
	            return -1;
	        }
	    }
	
}
