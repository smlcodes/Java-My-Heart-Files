import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class  Test extends HttpServlet
{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
	
	
		PrintWriter pw = 	res.getWriter();

		res.setContentType("text/html");

		pw.println("<h1>  TESTING IS DONE");
	
	
	}

}
