/*<applet code = MouseEvents  height = 500 width = 500>
</applet>*/

import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class MouseEvents extends Applet
{
	String op ;
	int x,y;

	public void init()
	{
		setBackground(Color.black);
		setForeground(Color.red);
		op = "null";
		x = 100;
		y = 100;

	}//init

	public void start()
	{
	ml m1 = new ml();
	addMouseListener(m1);

	mml m2 = new mml();
	addMouseMotionListener(m2);
	
	}//start

	public void paint(Graphics g)
	{
	Font f = new Font("Arial",Font.BOLD, 40);
	g.setFont(f);
	g.drawString(op+"("+x+","+y+")",x,y);
	}//paint

  class ml extends MouseAdapter
  {

	public void mouseEntered(MouseEvent e)
	  {
		showStatus("mouseEntered");
	}

		public void mouseExited(MouseEvent e)
	  {
		showStatus("mouseExited");
		}

			public void mouseClicked(MouseEvent e)
		{
		op = "mouseClicked";
		x = e.getX();
		y = e.getY();
		repaint();
		}

	public void 		mousePressed(MouseEvent e)
		{
		op = "	mousePressed";
		x = e.getX();
		y = e.getY();
		repaint();
	}


		public void 	mouseReleased(MouseEvent e)
		{
		op = "mouseReleased";
		x = e.getX();
		y = e.getY();
		repaint();
	}



  }//ml

  class mml extends MouseMotionAdapter
  {
		
		public void mouseMoved(MouseEvent e)
		{
		op = "	mouseMoved";
		x = e.getX();
		y = e.getY();
		repaint();
	}

		public void mouseDragged(MouseEvent e)
		{
		op = "	mouseDragged";
		x = e.getX();
		y = e.getY();
		repaint();
	}


  }


	
	
}//MouseEvents
  
  ��@������@���2hP�'�)�O�w ��B  ԛ � r���<j ��	J�r���y@��H  r �� :2	# A�� >�r