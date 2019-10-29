/*Q7. To find the sum of any number of integers interactively, i.e., entering every number from the keyboard,
 whereas the total number of integers is given as a command line argument.*/

import java.util.*;
class add
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers :");
		int a[]=new int[n];
		int add=0;					//we can use class name as a variable for diiferent purpose
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			add+=a[i];
		}
		System.out.println("The addition of given numbers is :"+add);
	}
}
