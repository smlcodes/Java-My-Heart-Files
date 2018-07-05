import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;


/*<applet code="mouse" width=300 height=300>
</applet>*/

public class mouse extends Applet
{
	String msg;
	int x,y;
	
	public void init ()
	{
		x=100;
		y=100;
		msg=null;
		
		setBackground (Color.yellow);
		setForeground (Color.green);
				
				ml ob1 = new ml();
				mml ob2 = new mml();
			addMouseListener (ob1);
			addMouseMotionListener (ob2);

	}//init


		public void paint (Graphics g)
		{
			Font f=new Font ("verdana", Font.BOLD, 60);
			//g.getFont (f);
			g.drawString (msg+"("+x+","+y+")",x,y);
		}


	class ml implements MouseListener
	{
	
		public void mouseEntered (MouseEvent me)
		{
			 showStatus ("MOUSE ENTERED IN THE WINDOW");
		}

		public void mouseExited (MouseEvent me)
		{
			 showStatus ("MOUSE EXITED FROM WINDOW");
		}


		public void mousePressed (MouseEvent me)
		{
				 msg="Mouse Pressed";
				 x=me.getX ();
				 y=me.getY ();
				 repaint ();
		}


		public void mouseReleased (MouseEvent me)
		{
				 msg="Mouse Released";
				 x=me.getX ();
				 y=me.getY ();
				 repaint ();
		}


		public void mouseClicked (MouseEvent me)
		{
			 msg="Mouse Clicked";
			 x=me.getX ();
			 y=me.getY ();
			 repaint ();
		}

	}//mouseList

	class mml extends MouseMotionAdapter
	{
	
		public void mouseMoved (MouseEvent me)
		{	
				 msg="Mouse Moved";
				 x=me.getX ();
				 y=me.getY ();
				 repaint ();
		}

	public void mouseDragged (MouseEvent me)
	{
				 msg="Mouse Dragged";
				 x=me.getX ();
				 y=me.getY ();
				 repaint ();
	}
}//motion
}//main
