/*Call System.gc(), check whether GC runs or not*/
package com.gctesting;

import com.employee.Employee;

public class GCTesting {

	
	public static void main(String args[])
	{
		
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		emp1=emp2;
		

		
	}
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("Garbage is collected");
	}

	
	
	}
