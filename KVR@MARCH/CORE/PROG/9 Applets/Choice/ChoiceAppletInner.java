/*
<applet code = "ChoiceAppletInner.class"	width= 300		height = 300>
</applet>
*/


import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class ChoiceAppletInner extends Applet 
{
		Label l1,l2;
		Choice c1,c2;

	public void init()
		{
			FlowLayout f = new FlowLayout();
			setLayout(f);
			setSize(230,200);
			setVisible(true);

			l1 = new Label("Avilable Seats");
			l2 = new Label("Selected Seats");

			c1 = new Choice();
			c2 = new Choice();

			for(int i=1; i<=50;i++)
			{
			String s1 = String.valueOf(i);
			c1.add(s1);
			}

			add(l1);
			add(c1);
			add(l2);
			add(c2);

			Inner ii = new Inner();
			c1.addItemListener(ii);
		
		}//cons
	
class Inner implements ItemListener
{

	public void  itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==c1)
		{
		String  s1 = c1.getSelectedItem();
		c2.add(s1);
		c1.remove(s1);
		
		}
	
	}
}
}
