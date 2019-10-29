import java.awt.*; 
import java.applet.*; 
import java.net.*; 
/* 
<applet code="q26" width=200 height=200> 
</applet> 
*/ 

public class q26 extends Applet 
{ 
	public void paint(Graphics g)
 	{     
		setBackground(Color.yellow);     
		setForeground(Color.red);   
		String msg; 
		URL url = getCodeBase();
	 	msg = "Code base: " + url.toString();    
	 	g.drawString(msg, 10, 20); 
	 
	    	url = getDocumentBase(); 
		msg = "Document base: " + url.toString();   
		g.drawString(msg, 10, 40);   
		}
}
