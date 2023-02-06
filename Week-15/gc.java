import java.applet.*;
import java.awt.*;
/*
<applet code="Rectangles" width=100 height=200>
</applet>
*/
public class rectangle extends Applet
{
	public void paint(Graphics g)
	{
		g.drawsString("Graphics and Color Class",200,200);
		g.drawLine(200,200,300,200);
	}
}