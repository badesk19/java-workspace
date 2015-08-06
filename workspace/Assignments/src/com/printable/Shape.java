/*Create a class hierarchy :     Shape
 * 
                  Rectangle     Circle       Triangle
                  
Override method calculateArea() from Shape class in its each subclass
Create an array of Shape references & observe dynamic polymorphism*/

package com.printable;//package name

public class Shape implements Printable {		//class name

	public Shape()
	{		
	}
	
	public double calculateArea()
	{
		double area=0.0;
		return area;
		
	}

	@Override
	public void print(Printable[] p) {
		System.out.println("Inside shape");
		
	}
}

class Rectangle extends Shape{
	int length;
	int width;
	
	public Rectangle()
	{
	}
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		
		return length*width;
	}
	
	@Override
	public void print(Printable[] p) {
		System.out.println("Inside Rectangle");
	}
}

class Circle extends Shape
{
	int radius;
	public Circle()
	{
	}
	
	
	public Circle(int radius) {
		this.radius = radius;
	}


	@Override
	public double calculateArea() {
		
		return 3.14*radius*radius;
	}
	@Override
	public void print(Printable[] p) {
		System.out.println("Inside Circle");
	}
	
	
}

class Triangle extends Shape
{
	int base;
	int height;
	public Triangle()
	{
	
	}
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double calculateArea() {

		return (base*height)/2;
	}
	
	@Override
	public void print(Printable[] p) {
		System.out.println("Inside Triangle");
	}
}
