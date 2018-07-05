//So here include(-,-) jumps control from current page to Requeted page, and after completion of exceution it will come back
	//to  curernt page

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class srv1 extends HttpServlet
{

	public   void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		ServletConfig cg = getServletConfig();
		ServletContext sc = cg.getServletContext();

		res.setContentType("text/html");

		PrintWriter pw = res.getWriter();

		RequestDispatcher rd1 = sc.getRequestDispatcher("/s2");
		RequestDispatcher rd2 = sc.getRequestDispatcher("/s3");

		pw.println("<h1>From SRV1  - before calls </h1>");

		rd1.include(req,res);
		rd2.include(req,res);

			pw.println("<h1>From SRV1  - After calls </h1>");
		
	}
	public   void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
			doGet(req, res);
	}

}