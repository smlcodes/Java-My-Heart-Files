import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class srv2 extends HttpServlet
{

		public void doGet(HttpServletRequest  req, HttpServletResponse res) throws ServletException, IOException
		{
		
			res.setContentType("text/html");

			PrintWriter pw = res.getWriter();

			pw.println("<h1>SRV-2				:		Before sendRedirect()<h1>");

				res.sendRedirect("s3");

		pw.println("<h1>SRV-2			:		After sendRedirect()<h1>");

		
		}

		public void doPost(HttpServletRequest  req, HttpServletResponse res) throws ServletException, IOException
		{
				doGet(req,res);
		}



}