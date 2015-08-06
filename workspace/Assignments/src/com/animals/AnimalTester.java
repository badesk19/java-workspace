package com.animals; //package name

public class AnimalTester {	//class name

	public static void main(String args[]) {  //main method
	
		Animal []animalObjectArray=new Animal[3];
		
		 animalObjectArray[0]=new Cat();
		 animalObjectArray[1]=new Dog();
		 animalObjectArray[2]=new Lion();
		 
		 for(int i=0;i<animalObjectArray.length;i++)
		 {
			 animalObjectArray[i].talk();
		 }
	}
}
