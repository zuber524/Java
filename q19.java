//19. Write a program to show the use of nested try statements 
//that emphasizes the sequence of checking for catch handler statements. 

import java.util.*;
class q19
{
	public static void main(String []args)
	{
		Scanner s=new Scanner (System.in);
		System.out.print("\nEnter the limit of list :");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.print("\nEnter the elements of list :");
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		System.out.print("List :[");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+", ");
		System.out.print("\b\b] ");
		System.out.print("\nEnter the position of element you want to select :");
		int p=s.nextInt();
		try
		{
			int q=a[p-1];
			System.out.print("\nYou have selected :");
			System.out.print(q);
			System.out.print("\nEnter your divisor :");
			int r=s.nextInt();
			try
			{
				int div=q/r;
				System.out.print("\nQuotient :"+div);	
			}
			catch(ArithmeticException e)
			{
				System.out.print("\nException caught ...\nException is :"+e);
			}		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.print("\nException caught ...\nException is :"+e);	
		}
	}	
}
