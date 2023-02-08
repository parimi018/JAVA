import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="KE" width=400 height=400>
</applet>*/
public class KE extends Applet implements KeyListener
{
	String msg="";
	int x=20,y=20;
	public void init()
	{
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke)
	{
		showStatus("Key Pressed");
	}
	public void keyReleased(KeyEvent ke)
	{
		showStatus("Key Released");
	}
	public void keyTyped(KeyEvent ke)
	{
		msg+=ke.getKeyChar();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
	}
}