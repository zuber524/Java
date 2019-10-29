import java.util.*;

class pascal
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("\nEnter the number of rows : ");
		int n=s.nextInt();
		
		System.out.println("The pascal pyramid of "+n+" rows :");
		int k=1;
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>i;j--)
				System.out.print("\t");
			for(int j=0;j<=i;j++)
			{
				if(j==0)
				{
					k=1;
					System.out.print("\t"+k+"\t");
				}
				else
				{
					k=k*(i-j+1)/j;
					System.out.print("\t"+k+"\t");
				}
			}
			System.out.print("\n\n");
		}
	}
}		
