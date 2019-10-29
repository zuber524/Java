/*Q2. To find the factorial of a given number */

import java.util.*;
class fact
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int fact=1;
		System.out.println("Enter an integer :");
		int a=s.nextInt();
		for(int i=1;i<=a;i++)
			fact=fact*i;
		System.out.println("The factorial of "+a+" :"+fact);
	}
}
