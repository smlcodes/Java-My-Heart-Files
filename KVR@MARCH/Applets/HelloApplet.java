/*<applet code = HelloApplet  height = 500 width = 500>
</applet>*/


import java.awt.*;
import java.applet.Applet;
public class HelloApplet extends Applet//if we dont write publc prog will comple but no Output
{
public void paint(Graphics g)
	{
		g.drawString("HelloApplet",50,30);

	}

}
