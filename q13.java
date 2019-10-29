//13. Write a program to show the use of static functions and to pass variable length arguments in a function. 

class q13
{
	static 
	{
		System.out.println("Static block.");
	}
	static float ave(int ...a)
	{
		float sum=0;
		for(int x:a)
		{
			sum+=x;
		}
		float ave =sum/a.length;
		return ave;
	}
	public static void main(String args[])
	{
		System.out.println("The average of given three number... :"+ave(3,4,1));
		System.out.println("The average of given five number... :"+ave(3,4,1,6,8));
	}
}
