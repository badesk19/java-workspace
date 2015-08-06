/*Create a class hierarchy :				Animal
 * 
                  		Cat                  Dog            Lion
Animal class will have methods like respirate () & talk()
Override method talk() from Animal class in its each subclass
Create an array of Animal references & observe dynamic polymorphism
*/
package com.printable;  	//package name

public class Animal implements Printable {		//class name
	 
	public Animal()		//default constructor
	{}
	public void respirate () 
	 {
		
	 }
	 public void talk()
	 {
		 
	 }
	@Override
	public void print(Printable[] p) {
		System.out.println("Inside Animal");
		
	}
}

class Cat extends Animal 	//class name
{
	
	public Cat()	//default constructor
	{
		
	}
@Override
public void talk() {
	System.out.println("Meaw Meaw");
}
@Override
public void print(Printable[] p) {
	System.out.println("Inside Cat");
}

}

class Dog extends Animal
{
	public Dog(){}	//default constructor
	
@Override
public void talk() {
	System.out.println("Bhow Bhow");
	}
@Override
public void print(Printable[] p) {
	System.out.println("Inside Dog");
}
}

class Lion extends Animal //class name
{
	
	public Lion()  //default constructor
	{}
@Override
public void talk() {
	System.out.println("Lion");
}	

@Override
public void print(Printable[] p) {
	System.out.println("Inside Lion");
}
}

