package com.printable;

public class Utility implements Printable {
Printable p1;

	public void printAll(Printable p[])
	{
		p1=new Utility();
		for(int i=0;i<p.length;i++)
		{
		p[i].print(p);
		}
	}

	@Override
	public void print(Printable[] p) {
	
		
	}

	
		
	}

	

