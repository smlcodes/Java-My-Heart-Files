//RadioButtonFrameInner
//Using Object Typecast

import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;

class RadioButtonFrame extends Frame// 
{
	Checkbox cb1,cb2,cb3,cb4;
	CheckboxGroup g1,g2;
	Label l1;
	Button b1;

RadioButtonFrame()
	{
	setSize(300,300);

	FlowLayout f =  new FlowLayout();
	setLayout(f);


	cb1 = new Checkbox("C");
	cb2 = new Checkbox("C++");
	cb3 = new Checkbox("JAVA");
	cb4 = new Checkbox(".NET");
	l1 =  new Label("");
	b1 = new Button("OUT");

	g1 = new CheckboxGroup();
	g2 = new CheckboxGroup();

	cb1.setCheckboxGroup(g1);
	cb2.setCheckboxGroup(g1);
	cb3.setCheckboxGroup(g2);
	cb4.setCheckboxGroup(g2);

	add(cb1); add(cb2); add(cb3); add(cb4);  add(l1); add(b1);

RadioButtonFrameAction ob = new RadioButtonFrameAction();

	cb1.addItemListener(ob);
	cb2.addItemListener(ob);
	cb3.addItemListener(ob);
	cb4.addItemListener(ob);
	b1.addActionListener(ob);
		setVisible(true);
	
	}//constrtor

	class RadioButtonFrameAction implements ItemListener,ActionListener
	{
	public void itemStateChanged(ItemEvent ie)
	{
		Checkbox cb = (Checkbox)ie.getItemSelectable();

			if(cb.getState())
			{
			l1.setText("Ur Selected Course	:"+cb.getLabel());
			
			}//if
	
	}//itemStateChanaged

	public void actionPerformed(ActionEvent ae)
	{
	if(ae.getSource()==b1)
		{
	System.exit(0);
	
		}
	}//actionPerformed



}//class Inner

}//class Outer


class RadioButtonFrameInner
{
	public static void main(String args[])
	{
	RadioButtonFrame o = new RadioButtonFrame();
	
	}
} �                                                                                                                                                                                                                            