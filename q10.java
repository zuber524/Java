/*Q10. Modify the distance class by creating constructor for assigning values (feet and inches) to the distance object.
 Create another object and assign second object as reference variable to another object reference variable.
 Further create a third object which is a clone of the first object. */

import java.util.*;
 public class q10
{
	public static void main(String args[])
	{
		distance obj1, obj2, obj3;						
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the distance in metre :");
		double m=s.nextDouble();
		obj1=new distance();		
   		obj2=new distance(m);							//created an object  
   		distance obj=null ;
		obj=obj2;									// an object obj2 is assigned to a reference variable obj
		obj3=new distance(obj1);							//obj3 is the clone of obj1
		System.out.println("Object 1 :");
   		obj1.convert();
		System.out.println("Object 2 :");
   		obj.convert();
		System.out.println("Object 3 :");
   		obj3.convert();
	 }
}

