/*Q.To learn use of single dimensional array by defining the array dynamically */

import java.util.*;
class arr1
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n=s.nextInt();
		int sum =0;
		System.out.println("Enter the elements of array :");
		int a[]=new int[n];						//defining the array dynamically
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			sum+=a[i];
		}
		System.out.println("The array you have entered :");
		System.out.print("{");
		for(int i=0;i<n;i++)
			System.out.print(" "+a[i]+", ");
		System.out.print("\b\b }\n");
		System.out.println("The sum of elements of array  :"+sum);
	}
}
