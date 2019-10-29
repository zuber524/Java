/*12.  Write a program to show the difference between public and private access specifiers. The program should also show that primitive data types are passed by value and objects are passed by reference and to learn use of final keyword*/

import java.util.*;

class access
{
	private int i,j;
	public void show(int x,int y )
	{
		i=x;	j=y;
		System.out.println("Your given values have assigned to the private value ... \ni :"+i+" j :"+j);
	}
}

class pass
{
	int x,y;
	pass(int m,int n)
	{
		x=m;	y=n;			
	}
	public boolean equals(pass obj)
	{
		if(this.x==obj.x&&this.y==obj.y)
		return true;
		else
		return false;
	}
}

class pi
{
	public void show()
	{
		final double pi=Math.PI;
		System.out.println("Final value can not be changed ... \npi-->"+pi);
	}
}

class q12
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your 1st number :");
		int a=s.nextInt();
		System.out.println("Enter your 2nd number :");
		int b=s.nextInt();
		access obj=new access();
		obj.show(a,b);
		System.out.print("\nObjecs are pass by reference and datatype are pass by value---> \n");
		pass ob1=new pass(1,2);
		pass ob2=new pass(11,22);
		pass ob3=new pass(1,2);
		System.out.println("object 1==object 2 :"+ob1.equals(ob2));
		System.out.println("object 1==object 3 :"+ob1.equals(ob3));
		pi o=new pi();
		o.show();
		System.out.println();
	}
}

