/*Override equals(),toString() in Account class*/

package com.overriding;

public class Account {

	String name;
	String address;
	public Account() {
	}
	public Account(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString()
	{
		String s="Name="+name+"Address="+address;
		return s;

	}
	
	@Override
	public boolean equals(Object obj)
	{
		Account acc=(Account)obj;
		if(this.name==acc.getName()&&this.address==acc.getAddress())
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
		hashCode =  10* hashCode + this.name.hashCode();
		hashCode = 10 * hashCode + this.address.hashCode();
		return hashCode;
	}
	
	
}
