//Approch1 : Prog to make a connction using Type-1 Driver

import java.sql.*;

public class  Approch7

{
	public static void main(String[] args)  throws Exception
	{

		String s1 = System.getProperty("name");	

		Class.forName(s1);

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


/*

java  -D name = sun.jdbc.odbc.JdbcOdbcDriver  Approch7

*/