import java.awt.*; 
import java.applet.*; 
/* 
<applet code="q25" width=300 height=50>
</applet>
 */ 
 
public class q25 extends Applet implements Runnable 
{   
	String msg = "My name is KHAN....";   
	Thread t;   
	int state;   
	volatile boolean flag; 
 	
	public void init() 
	{     
		setBackground(Color.yellow);     
		setForeground(Color.red);   
	} 
	
	public void start() 
	{    
		 t = new Thread(this);     
		flag = false;     
		t.start();   
	} 
	
	public void run() 
	{ 
		for( ; ; ) 
		{     try
			{
				repaint();         
				t.sleep(250);         
				if(flag)           
				break;     
			}
			catch(Exception e){}  
		} 
	}
 
	public void stop() 
	{    
	 	flag = true;     
		t = null;  
	 } 
 
	public void paint(Graphics g)
	 {    
		 char ch; 
		 ch = msg.charAt(0);    
		 msg = msg.substring(1, msg.length());    
		msg += ch; 
    		g.drawString(msg, 50, 30);   
	}
}
