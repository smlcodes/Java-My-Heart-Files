//Approch1 : Prog to make a connction using Type-1 Driver

import java.sql.*;

class  Approch4
{
	public static void main(String[] args)  throws Exception
	{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

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


