//23. Write a program to create URL object, create a URL Connection using the openConnection() method and 
//then use it examine the different components  of the URLand content. 

import java.net.*; 
import java.io.*; 
import java.util.Date; 
 
class q23 
{   
	public static void main(String args[]) throws Exception 
	{     
	int c;     
	URL a = new URL("http://www.google.in");
	URLConnection ac = a.openConnection(); 
	long d = ac.getDate();     
	if(d==0)       
		System.out.println("No date information.");     
	else       
		System.out.println("Date: " + new Date(d));
	System.out.println("Content-Type: " + ac.getContentType()); 
 	d = ac.getExpiration();     
	if(d==0)       
		System.out.println("No expiration information.");     
	else       
	System.out.println("Expires: " + new Date(d)); 
 	d = ac.getLastModified();    
 	if(d==0)       
		System.out.println("No last-modified information.");     
	else       
		System.out.println("Last-Modified: " + new Date(d)); 
	long len = ac.getContentLengthLong();     
	if(len == -1)       
		System.out.println("Content length unavailable.");    
	 else       
		System.out.println("Content-Length: " + len); 
 	if(len != 0) 
	{       
		System.out.println("=== Content ===");      
		InputStream input = ac.getInputStream();       
		while ((c = input.read()) != -1) 
		{         
			System.out.print((char) c);      
		}       
		input.close();
	}
	else
	System.out.println("No content available  .");  
}
}    
