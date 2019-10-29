
import java.util.*;
class eg
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of vertex :");
	    	int n=s.nextInt();
	        System.out.println("Mark the edges :");
	        int a[][]=new int[n][n];		
	       	for(int i=0;i<n;i++)
	       	{
			for(int j=0;j<n;j++)
	        	 	a[i][j]=s.nextInt();
	       	}
		int d=0;
	       	for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
		 	{
		  		if(a[i][j]==1||a[j][i]==1)
				d++;
		       	}
      		}
		if(d%2==0||d==0)
     			System.out.println("Eular path.");
      		else
     			System.out.println("Not an Eular path.");
	}
}
