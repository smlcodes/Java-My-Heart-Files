import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class srv2 extends HttpServlet
{

	public  void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");

		PrintWriter pw = res.getWriter();

		String s1 = req.getParameter("t1");

		int a = Integer.parseInt(s1);

		int b = a*a;

		pw.println("<h1>Squre from SRV2		:	"+b+"</h1>");
	}

	public  void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
			doGet(req, res);
	}

}