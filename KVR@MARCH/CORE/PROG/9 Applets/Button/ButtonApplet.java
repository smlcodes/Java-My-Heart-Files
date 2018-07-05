/*<applet code = "ButtonApplet.class" width=500 height = 500>
</applet>*/


import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;


public class ButtonApplet  extends Applet
{
Button b1,b2,b3,b4;
Label l1;

	public void init()
	{

	BorderLayout  b = new BorderLayout();
	setLayout(b);


	setVisible(true);

	b1 = new Button("OK");
	b2 = new Button("CANCEL");
	b3 = new Button("HELP");
	b4 = new Button("EXIT");

	l1 = new Label();
	l1.setAlignment(Label.CENTER);

	add(b1,"North");
	add(b2,"South");
	add(b3,"East");
	add(b4,"West");
	add(l1);
	
	}

public void start()
	{

	ActionLis ob = new ActionLis();
	
	b1.addActionListener(ob);
	b2.addActionListener(ob);
	b3.addActionListener(ob);
	b4.addActionListener(ob);

	}



class ActionLis implements ActionListener
{

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
		String s1 = b1.getLabel();
		l1.setText(s1);
		
		}

		if(ae.getSource()==b2)
		{
			String s1 = b2.getLabel();
			l1.setText(s1);
		}

		if(ae.getSource()==b3)
		{
			String s1 = b3.getLabel();
			l1.setText(s1);
		}
	
	if(ae.getSource()==b4)
		{
					System.exit(0);
		}
	
	}

}
}//class

