package com.collection;

import com.overriding.Account;

public class Book {

	String name;
	String author;
	int price;
	
	public Book() {
	}

	public Book(String name, String author, int price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	@Override
	public boolean equals(Object obj)
	{
		Book bookObj=(Book)obj;
		if(this.name==bookObj.getName()&&this.author==bookObj.getAuthor()&&this.price==bookObj.getPrice())
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
		hashCode =  10* hashCode + this.name.hashCode()+this.author.hashCode();
		
		return hashCode;
	}
	
	
}
