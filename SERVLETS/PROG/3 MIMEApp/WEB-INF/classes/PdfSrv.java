import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class PdfSrv extends HttpServlet
{

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
	
			System.out.println("pdf  ---Obj is created with out Reqst");
			res.setContentType("application/pdf	");

			PrintWriter pw = res.getWriter();

			pw.println("<table>");
			pw.println("<tr><th>Name</th></tr>");
			pw.println("<tr><td>satya</tr></td>");
			pw.println("<tr><td>Johhny</tr></td>");
			pw.println("<tr><td>Kaveti</tr></td>");
	}

	
	}
