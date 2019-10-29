/*18. Write a program DivideByZero that takes two numbers a and b as input, computes a/b, 
and invokes Arithmetic Exception to generate a message when the denominator is zero.*/

import java.util.*;
class q18
{
	public static void main(String []args)
	{
		Scanner s=new Scanner (System.in);
		System.out.print("Enter  a :");
		int a=s.nextInt();
		System.out.print("Enter  b :");
		int b=s.nextInt();
		float x;
		try
		{
			x=a/b;
			System.out.println("a/b :"+x);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception caught .\nexception is...\n"+e);
		}
	}	
}
