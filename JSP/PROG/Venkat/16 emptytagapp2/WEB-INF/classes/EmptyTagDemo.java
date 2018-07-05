package demo;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class  EmptyTagDemo extends TagSupport
{
	private int howMany = 0;

	public void setHowMany(int howMany)
	{
	this.howMany = howMany;
	}

	public int getHowMany()
	{
	return howMany;
	}

	public int doStartTag()
	{
		try
		{
			JspWriter out = pageContext.getOut();
			for(int i = 0;i<=getHowMany();i++)
			{
			out.println("welcome");
			}

		}
		catch (Exception e)
		{
			System.err.println(e);
		}
		return SKIP_BODY;

	}
}
