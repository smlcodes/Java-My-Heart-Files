import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class srv1 extends HttpServlet
{

		public void service(HttpServletRequest  req, HttpServletResponse res) throws ServletException, IOException
		{

			res.setContentType("text/html");
			PrintWriter pw = res.getWriter();
				
			String name	  = req.getParameter("t1");
			String fname = req.getParameter("t2");

				Cookie c3 = new Cookie("cname",name);
				Cookie c4 = new Cookie("cfname",fname);
				res.addCookie(c3);
				res.addCookie(c4);

				pw.print("<h1>	Ur name		:</h1>"+name);
				pw.print("<h1>	Ur Father	Name	:</h1>"+fname);


				pw.println("<form action='s2' >");
				pw.println("	 Income	 :<input type = 'text' name = 'i'>");
				pw.println("	 Tax :<input type = 'text' name = 't'>");
				pw.println("<input type = 'submit' name = 'tc'></form>");
	
		}
}
