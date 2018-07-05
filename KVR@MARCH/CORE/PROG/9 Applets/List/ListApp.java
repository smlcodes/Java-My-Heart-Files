//Write a java program which illustrates the concept of List?


/*<applet code="ListApp" height=200 width=200>
</applet>*/


import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class ListApp extends Applet
{
	Label l1, l2;
	List li;
	TextArea ta;


	public void init ()
	{
		setBackground (Color.yellow);
		l1=new Label ("Available fonts");
		l2=new Label ("Selected fonts");
		ta=new TextArea ();
		li=new List ();
		li.setMultipleMode (true);


GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment ();
String s []=ge.getAvailableFontFamilyNames ();

for (int i=0; i<s.length; i++)
{
li.add (s [i]);
}

add (l1);add (li);add (l2);add (ta);

li.addItemListener (new itl ());
li.addActionListener (new atl ());

}

class itl implements ItemListener
{
public void itemStateChanged (ItemEvent ie)
{
if (ie.getSource ()==li)
{
String s1 []=li.getSelectedItems ();
for (int j=0; j<s1.length; j++)
{
ta.append (s1 [j]+"\n");
}
}
}
}
class atl implements ActionListener
{
public void actionPerformed (ActionEvent ae)
{
if (ae.getSource ()==li)
{
String s2 []=li.getSelectedItems ();
for (int l=0; l<s2.length; l++)
{
ta.append (s2 [l]+"\n");
}
}
}
}
};
