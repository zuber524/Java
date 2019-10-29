/*Q4.  To learn use of  in case of a two dimensional array */

import java.util.*;
class arr2
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows of 1st matrix :");
	    	int r1=s.nextInt();
	        System.out.println("Enter the number of columns of 1st matrix :");
	        int c1=s.nextInt();
	        System.out.println("Enter the elements of 1st matrix :");
	        int a[][]=new int[r1][c1];						//defining the 2D array dynamically
	       	for(int i=0;i<r1;i++)
	       	{
			for(int j=0;j<c1;j++)
	        	 	a[i][j]=s.nextInt();
	       	}
	        System.out.println("Enter the number of rows of 2nd matrix :");
	    	int r2=s.nextInt();
	        System.out.println("Enter the number of columns of 2nd matrix :");
	        int c2=s.nextInt();
	        System.out.println("Enter the elements of 2nd matrix :");
		int b[][]=new int[r2][c2];
	        for(int i=0;i<r2;i++)
	        {
		        for(int j=0;j<c2;j++)
		      		b[i][j]=s.nextInt();
	        }
	       	int c[][]=new int[10][10];
	      	if(c1==r2)
	       	{
	       		System.out.print("The multiplication of matrix :\n");
		       	for(int i=0;i<r1;i++)
		       	{
				for(int j=0;j<c2;j++)
			 	{
		     	         	c[i][j]=0;
		          		for(int k=0;k<c1;k++)
		                 		c[i][j]+=a[i][k]*b[k][j];
		          	}
		       	}
		      	for(int i=0;i<r1;i++)
		      	{
		      		for(int j=0;j<c2;j++)
					System.out.print(c[i][j]+"\t");
       			System.out.print("\n");
		      	}
      		}
      		else
     			System.out.println("The multiplication of matrix is not possible.");
	}
}
