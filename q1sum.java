/*Q1. To find the sum of any number of integers entered as command line arguments */

class sum
{
	public static void main(String args[])
	{
		int a=0;
		for(int i=0;i<args.length;i++)
			a+=Integer.parseInt(args[i]);			//parsing string to integer
		System.out.println("The sum of given number :"+a);
	}
}
