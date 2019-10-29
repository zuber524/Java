import java.awt.*; 
import java.awt.event.*;
import java.applet.*; 
/*
<applet code="q28" width=300 height=100>   
</applet>
 */ 
 
public class q28 extends Applet  implements KeyListener 
{  
 	String msg = "";  
 	int X = 10, Y = 20;
 
 	 public void init()
 	{     
		addKeyListener(this);  
 	} 
 
	public void keyPressed(KeyEvent ke) {     showStatus("pressed");   } 
 
  	public void keyReleased(KeyEvent ke) {     showStatus("released");   } 
 
  	public void keyTyped(KeyEvent ke) {     msg += ke.getKeyChar();     repaint();   } 
 
 	public void paint(Graphics g) {     g.drawString(msg, X, Y); }
}
