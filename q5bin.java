/*Q5.  To convert a decimal to binary number */

import java.util.*;
class bin
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number :");
		float m=s.nextFloat();
		int n=(int)m;
		float o=m-n;
		float r;
		int ar[]=new int[20];
		int br[]=new int[50];
		int i;
		for(i=0;n>0;i++)
		{
			ar[i]=n%2;
			n/=2;
		}
		System.out.println("The binary version of "+m+"  :");
		for(int k=i-1;k>=0;k--)
			System.out.print(ar[k]);
		if(o>0)
		{
			System.out.print(".");
			for(int j=0;o>0;j++)
			{
				r=o*2;
				if(r>=1)
				{
					br[j]=1;
					System.out.print(br[j]);
					o=r-1;
				}
				else if(r<1)
				{
					br[j]=0;
					System.out.print(br[j]);
					o=r;
				}
			}
		}
		System.out.print("\n");
	}
}
