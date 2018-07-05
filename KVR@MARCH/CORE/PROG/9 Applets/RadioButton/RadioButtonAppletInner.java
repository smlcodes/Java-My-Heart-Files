/*
<applet code = "RadioButtonAppletInner.class"	width= 300		height = 300>
</applet>
*/

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class RadioButtonAppletInner extends Applet 
{

	Checkbox c1, c2, c3,c4;
	Label l1, l2;

	public void init()
	{
	
	setVisible(true);
	c1 = new Checkbox("C");
	c2 = new Checkbox("C++");	//g1
	
	c3 = new Checkbox("JAVA");
	c4 = new Checkbox(".NET");//g2

	l1 = new Label("Ur's Selected Couese:  ");
	l2 = new Label();

	CheckboxGroup g1 =new CheckboxGroup();
	CheckboxGroup g2 =new CheckboxGroup();

	c1.setCheckboxGroup(g1);
	c2.setCheckboxGroup(g1);

	c3.setCheckboxGroup(g2);
	c4.setCheckboxGroup(g2);

	add(c1);
	add(c2);
	add(c3);
	add(c4);
	add(l1);
	add(l2);
	}

	public void start()
	{
		Inner io = new Inner();
	c1.addItemListener(io);
	c2.addItemListener(io);
	c3.addItemListener(io);
	c4.addItemListener(io);
	
	}

class Inner implements ItemListener
{
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==c1)
		{
			if(c1.getState())
			{
				String s1 = c1.getLabel();
				l2.setText(s1);
			}
		}
	
		if(ie.getSource()==c2)
		{
			if(c2.getState())
			{
				String s1 = c2.getLabel();
				l2.setText(s1);
			}
		}
	
		if(ie.getSource()==c3)
		{
			if(c3.getState())
			{
				String s1 = c3.getLabel();
				l2.setText(s1);
			}
		}
	
		if(ie.getSource()==c4)
		{
			if(c4.getState())
			{
				String s1 = c4.getLabel();
				l2.setText(s1);
			}
		}
	
	}//method
}//inner class
}//outer

