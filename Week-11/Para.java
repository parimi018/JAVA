import java.io.*;
import java.awt.*;
import java.applet.*;
/*<applet code= "Para" width="300" height="300">
<param name= "n" value="Shreyas Parimi">
<param name="r" value="Y21CS164">
<param name= "d" value="Computer Science">
<param name= "c" value="RVR & JC College of Engineering">
</applet>*/
public class Para extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.black);
		setForeground(Color.white);
		g.drawString("Name:"+getParameter("n"),100,100);
		g.drawRect(98,88,270,52);
		g.drawLine(100,101,368,101);
		g.drawString("Regd no:"+getParameter("r"),100,112);
		g.drawString("Department:"+getParameter("d"),100,124);
		g.drawString("Collage name:"+getParameter("c"),100,136);
	}
}
