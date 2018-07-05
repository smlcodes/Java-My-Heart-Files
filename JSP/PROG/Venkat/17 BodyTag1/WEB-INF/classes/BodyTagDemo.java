package demo;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class  BodyTagDemo extends BodyTagSupport
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

	public int doAfterBody()
	{
		try
		{
			BodyContent bc = getBodyContent();
			String s = bc.getString();
			JspWriter out = bc.getEnclosingWriter();
			for(int i = 0;i<=getHowMany();i++)
			{
			out.println(s+"<br>");
			}

		}
		catch (Exception e)
		{
			System.err.println(e);
		}
		return SKIP_BODY;

	}
}
