//Approch1 : Prog to make a connction using Type-1 Driver

import java.sql.*;

public class  Approch10

{
	public static void main(String[] args)  throws Exception
	{

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
