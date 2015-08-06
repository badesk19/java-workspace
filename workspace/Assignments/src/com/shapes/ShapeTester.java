package com.shapes;

public class ShapeTester {
	public static void main(String args[])
	{
		Shape []shapeObjectArray=new Shape[3];
		
		shapeObjectArray[0]=new Circle(10);
		shapeObjectArray[1]=new Rectangle(10,20);
		shapeObjectArray[2]=new Triangle(4,5);
		 
		 for(int i=0;i<shapeObjectArray.length;i++)
		 {
			 System.out.println(shapeObjectArray[i].calculateArea());
		 }

	
	
	
	
		
	}
	
}
