import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class srv1 extends HttpServlet
{
		public void service(HttpServletRequest  req, HttpServletResponse res) throws ServletException, IOException
		{

			res.setContentType("text/html");
			PrintWriter pw = res.getWriter();
				
			String uname	= req.getParameter("t1");
			String pwd		= req.getParameter("t2");

			
			if(uname.equals("aaa")&&pwd.equals("aaa"))
			{

				HttpSession  ses = 	req.getSession();


			ses.setAttribute("uname", uname);

			pw.println("<h1>WELCOME");

			String url = "s2";

				pw.println("LOGIN SUCCSES <a href ="+res.encodeUrl(url)+" >Click go to home page</a>	<h2>");

			}
			else
			{

				pw.println("<h1>Login Failed	</h1>	");
			}

			}
}
