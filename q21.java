//21. Write a program to demonstrate priorities among multiple threads. 

class newThread implements Runnable 
{	
	String s;
	int x;
	Thread t;
	newThread(String str,int xyz) 
	{     
		s=str; 
		x=xyz;
		t=new Thread(this,s);
		t.setPriority(x);
		System.out.println("Thread  :" + t);     
		t.start(); 
	} 
	public void run() 
	{           
		try
		{
			for(int i = 20; i <=100; i=i+20)
			{
			         System.out.println(i+" % work done by CPU of "+s);         
				t.sleep(500);       
			}     
		} 
		catch (InterruptedException e) 
		{} 
	    	System.out.println("Work finished of "+s);   
	} 
}	 
 
class q21
{   
	public static void main(String args[]) throws InterruptedException 
	{     
		new newThread("A",Thread.MIN_PRIORITY);
		new newThread("B",Thread.NORM_PRIORITY);
		new newThread("C",Thread.MAX_PRIORITY);     
	} 
}

