import java.awt.*;
import java.awt.event.*;

class TextAreaFrame extends Frame implements TextListener
{

	Label l1,l2;
	TextField t1;
	TextArea t2;

	TextAreaFrame()
	{
	
	FlowLayout f = new FlowLayout();
	setLayout(f);
	setSize(300,300);
	setVisible(true);

	l1 = new Label("Enter Text");
	l2 = new Label("Copied Text");

	t1 = new TextField(15);
	t2 = new TextArea(10,10);

	add(l1);			add(t1);			add(l2);			add(t2);		

	t1.addTextListener(this);
	}

	public void textValueChanged(TextEvent te)
	{
		if(te.getSource()==t1)
		{
		String s1 = t1.getText();
		t2.append(s1+"\n");
		}
	
	}


}


public class TextAreaFrameThis 
{
	public static void main(String[] args) 
	{
		TextAreaFrame tf = new TextAreaFrame();
	}
}
