package com.printable;




public class PrintableTester {

	public static void main(String args[])
	{
		Animal animal1=new Cat();
		Animal animal2=new Dog();
		Animal animal3=new Lion();
		Shape shape1=new Circle();
		Shape shape2=new Rectangle();
		Shape shape3=new Triangle();
		Printable p1[]=new Printable[6];
		
		p1[0]=animal1;
		p1[1]=animal2;
		p1[2]=animal3;
		p1[3]=shape1;
		p1[4]=shape2;
		p1[5]=shape3;
		
	
		Utility util=new Utility();
		util.printAll(p1);
			

		
		
		
		
		
		
		
	}
}
