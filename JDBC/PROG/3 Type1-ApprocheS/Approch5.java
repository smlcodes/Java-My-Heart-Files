//Approch1 : Prog to make a connction using Type-1 Driver

import java.sql.*;

class  Approch5 

{
	public static void main(String[] args)  throws Exception
	{

		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn","system","a");

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


/*

java  Approch5 sun.jdbc.odbc.JdbcOdbcDriver

*/