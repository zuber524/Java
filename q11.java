/*11. Write a program to show that during function overloading, if no matching argument is found,  
then java will apply automatic type conversions(from lower to higher data type) */

import java.util.*;
class q11
{
	 double avg(double x,int y)
	{
		return (x+y)/2;
	}
	double avg(int x,double y,double z)
	{
		return (x+y+z)/3;
	}
	public static void main(String args[])
	{
		avg a=new avg();
		System.out.println("Automatic type conversion--:");
		System.out.println("1st method is calling... :");
		System.out.println("The average of all given number :"+a.avg(2,4));
		System.out.println("2nd method is calling... :");
		System.out.println("The average of all given number :"+a.avg(2,3,5));
	}
}
