import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class Submit extends HttpServlet
{

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
	
			res.setContentType("text/html");
			PrintWriter pw = res.getWriter();


			String s1 = req.getParameter("t1");
			String s2 = req.getParameter("t2");
			String  cap = req.getParameter("b");

			int a = Integer.parseInt(s1);
			int b = Integer.parseInt(s2);

			if(cap.equals("add"))
			{
			int c = a+b;
			pw.println("<h1><b>Sum is	 :"+c+"</b></h1>");
			}

			if(cap.equals("sub"))
			{
			int c = a-b;
			pw.println("<h1><b>Sub is	 :"+c+"</b></h1>");
			}

			if(cap.equals("mul"))
			{
			int c = a*b;
			pw.println("<h1><b>Mul is	 :"+c+"</b></h1>");
			}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
			doGet(req, res);
	}

}