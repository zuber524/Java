//20. Write a program to create your own exception types to handle situation specific to your application
// (Hint: Define a subclass of Exception which itself is a subclass of Throwable). 

import java.util.*;
class q20
{
	static double div(double a,double b) throws MyException
	{
		if(b==0)
		throw new MyException();
		return a/b;
	}	
	public static void main(String []args)
	{
		Scanner s=new Scanner (System.in);
		System.out.print("Enter  a :");
		float a=s.nextFloat();
		System.out.print("Enter  b :");
		float b=s.nextFloat();
		double x;
		try
		{
			x=div(a,b);
			System.out.println("a/b :"+x);
		}
		catch (MyException e)
		{
			System.out.println("Exception caught .\nexception is...\n"+e);
		}
	}	
}
