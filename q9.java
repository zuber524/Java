/*Q9. Write a program to create a distance class with methods where distance is computed in terms of feet and inches,
 how to create objects of a class and to see the use of this pointer */

import java.util.*;
class q9
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		distance obj1;
		System.out.println("Enter the distance in metre :");
		double m=s.nextDouble();
		obj1=new distance(m);			//creating an object 
		obj1.convert();
		System.out.println();
	}
}

