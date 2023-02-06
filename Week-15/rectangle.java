import java.applet.*;
import java.awt.*;
/*
<applet code="rectangle" width=1000 height=1000>
</applet>
*/
public class rectangle extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Graphics and Color Class",500,50);
		g.drawLine(500,52,644,52);
		g.drawRect(100,90,180,80);
		setBackground(Color.black);
		g.drawRoundRect(330,90,180,80,20,20);
		g.fillRect(560,90,180,80);
		setForeground(Color.white);
		g.fillRoundRect(790,90,180,80,20,20);
		setForeground(Color.white);
	}
}