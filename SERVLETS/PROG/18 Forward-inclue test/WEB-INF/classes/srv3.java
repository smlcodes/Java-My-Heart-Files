import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class srv3 extends HttpServlet
{

	public   void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		ServletConfig cg = getServletConfig();
		ServletContext sc = cg.getServletContext();

		res.setContentType("text/html");

		PrintWriter pw = res.getWriter();

		
	

		pw.println("<h1>SRV3   </h1>");

		
	

	
		
	}
	public   void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
			doGet(req, res);
	}

}