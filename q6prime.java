/*Q6.  To check if a number is prime or not, by taking the number as input from the keyboard */

import java.util.*;
class prime
{
	public static void main(String args[])
	{
		boolean f=true;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=s.nextInt();
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				f=false;
				System.out.println(n+" is not prime number."); 
				break;
			}
		}
		if(f==true)
			System.out.println(n+" is a prime number.");
	}
}
