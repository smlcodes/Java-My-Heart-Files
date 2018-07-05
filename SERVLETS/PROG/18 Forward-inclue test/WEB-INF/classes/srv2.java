import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class srv2 extends HttpServlet
{

	public   void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		ServletConfig cg = getServletConfig();
		ServletContext sc = cg.getServletContext();

		res.setContentType("text/html");

		PrintWriter pw = res.getWriter();

		
		RequestDispatcher rd2 = sc.getRequestDispatcher("/s3");

		pw.println("<h1>From SRV2  - before calls </h1>");

		
			rd2.include(req,res);

			pw.println("<h1>From SRV2  - After calls </h1>");
		
	}
	public   void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
			doGet(req, res);
	}

}