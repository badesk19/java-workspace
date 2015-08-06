/*Accept numbers from command line arguments & sort them*/
package com.commandlinearg;


import java.util.Arrays;

public class CmdLineArg {

	public static void main(String args[])
	{
		int arr[]=new int[10];
		for(int i=0;i<args.length;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
			
		}
		
		for(int i=1;i<arr.length;i++) 
		for(int j=0;j<arr.length-1;j++) 
		if(arr[j]>arr[j+1]){ 
		int temp=arr[j]; 
		arr[j]=arr[j+1]; 
		arr[j+1]=temp; 
		} 		


		
	
		
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
	}
}