//Prog to make a connction using Type-1 Driver

import java.sql.*;

class   Type1forName
{
	public static void main(String[] args)  throws Exception
	{

		//1.registerDriver with DriverManager

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		//2.load Driver usng url...and make connection

		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn","scott","tiger");

		if(con != null)
		{
			System.out.println("Success");
			System.out.println("Connection Obj	:	"+con.getClass());//class sun.jdbc.odbc.JdbcOdbcConnection
		}
		else
		{
			System.out.println("Fail");
		}

	}
}
