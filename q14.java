//14. Write a program to demonstrate the concept of boxing and unboxing.

class q14
{
	public static void main(String args[])
	{
		int a=10;
		//Integer b=new Integer(a);
		Integer b=a;
		System.out.println("Boxing the value : "+b);
		int c=b*4+9;
		System.out.println("Unboxing the value : "+c);
	}
}
