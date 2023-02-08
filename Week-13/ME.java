import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="ME" width=400 height=400>
</applet>*/
public class ME extends Applet implements MouseListener,MouseMotionListener
{
	String msg="";
	int x=0,y=0;
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		msg="Mouse Clicked";
		x=0;
		y=10;
		repaint();
	}
	public void mouseEntered(MouseEvent me)
	{
		msg="Mouse Entered";
		x=0;
		y=10;
		repaint();
	}
	public void mouseExited(MouseEvent me)
	{
		msg="Mouse Exited";
		x=0;
		y=10;
		repaint();
	}
	public void mousePressed(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="Pressed";
		repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="Released";
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="*";
		showStatus("Mouse dragging at"+x+","+y);
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		showStatus("Mouse Moving at"+x+","+y);
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
	}
}
	
	