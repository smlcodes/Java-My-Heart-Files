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
			pw.println("<h1>	CooKie...........");

			Cookie c[ ] =  req.getCookies();

			System.out.println("Arry Lenth"+c.length);

								pw.println("<table boarder = '4'>" );
								pw.println("<tr><th>Name</th>	<th> Value</th>	 <th> Vesion</th>	<th>Domain</th>	<th>Age</th>	<th>Comment</th> <th>Path</th></tr>" );

			for(int i=0; i<c.length;i++)
			{
				System.out.println("iam in loop...........");



					pw.println("<tr><td>"+c[i].getName()+"</td> ");
					pw.println("<td>"+c[i].getValue()+"</td> ");
					pw.println("<td>"+c[i].getVersion()+"</td> ");
					pw.println("<td>"+c[i].getDomain()+"</td> ");
					pw.println("<td>"+c[i].getMaxAge()+"</td>");
					pw.println("<td>"+c[i].getComment()+"</td> ");
					pw.println("<td>"+c[i].getPath()+"</td> </tr>");
				
			}
		pw.println("</table>");
			
		}

}
		