import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class srv2 extends HttpServlet
{

		public void service(HttpServletRequest  req, HttpServletResponse res) throws ServletException, IOException
		{
			res.setContentType("text/html");

			PrintWriter pw = res.getWriter();
							pw.println("<h1>		SRV 2</h1>");

			pw.println("<h1>req.getAttribute	:	</h1>"+req.getAttribute("a1"));

			HttpSession ses = req.getSession();  
			pw.println("<h1>ses.getAttribute	:	</h1>"+ses.getAttribute("a2"));
		

			ServletContext sc = getServletContext();
			pw.println("<h1>sc.getAttribute	:	</h1>"+ses.getAttribute("a3"));

			RequestDispatcher rd = req.getRequestDispatcher("/srv3");

			rd.include(req,res);

		
		}

}
		