//22. Write a program to demonstrate multithread communication by implementing synchronization among threads 
//(Hint: you can implement a simple producer and consumer problem).

class Q 
{  
 	int n;   
	boolean f = false; 
	synchronized int get() 
	{    
		while(!f)       
		try
		{     
			wait();
		}
		catch(Exception e)
		{}     
		System.out.println("Got: " + n);    
 		f = false;     
		notify();     
		return n;
	}   
 	synchronized void put(int n) 
	{  
		while(f)  
		try
		{     
			wait();
		}
		catch(Exception e)
		{}
 		this.n = n;       
		f= true;       
		System.out.println("Put: " + n);       	
		notify();   
	}
} 
 
class Producer implements Runnable 
{   
	Q q; 
	Producer(Q q) 
	{     
		this.q = q;     
		new Thread(this, "Producer").start();   
	} 
	public void run() 
	{    
		 int i = 0; 
   		 while(true)   
			q.put(i++);      
	} 
} 
 
class Consumer implements Runnable 
{   
	Q q; 
	Consumer(Q q) 
	{
		this.q = q;     
		new Thread(this, "Consumer").start();   
	} 
  	public void run() 
	{
	     while(true)      
		q.get();     
	} 
} 
 
class q22
{
	 public static void main(String args[]) 
	{    
		 Q q = new Q();     
		new Producer(q);     
		new Consumer(q); 
       }
}
