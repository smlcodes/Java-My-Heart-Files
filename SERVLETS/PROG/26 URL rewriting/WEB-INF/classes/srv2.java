import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;


public class srv2 extends HttpServlet
{

		public void service(HttpServletRequest  req, HttpServletResponse res) throws ServletException, IOException
		{
			res.setContentType("text/html");

			PrintWriter pw = res.getWriter();

			HttpSession hs = req.getSession();

			String name		=(String)hs.getAttribute("uname");
	
			
			
			
			pw.println("<br><h1>	Hi<h1>"+name+"U r Logged in SuccesFully</h1>");
	

													
			
		}

}
		