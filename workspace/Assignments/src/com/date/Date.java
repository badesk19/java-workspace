package com.date;

public class Date {

	int day;
	int month;
	int year;
	

	public Date() {
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void dateDisplay()
	{
		System.out.println("Day: "+day);
		System.out.println("Month: "+month);
		System.out.println("Year: "+year);
		
	}
	
}
