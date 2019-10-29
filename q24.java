import java.io.*;

class q24
{
	public static void main(String []args) throws IOException
	{
		File f1=new File("khan.txt");
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(i);
		FileWriter a=new FileWriter(f1);
		String s;
		System.out.println("Enter your string to write in file 'khan' ");
		s=b.readLine();
			a.write(s.toUpperCase());
		a.close();
		System.out.println("\nCOPIED ......\n");		
	}
}
