//Approch1 : Prog to make a connction using Type-1 Driver

import java.sql.*;

class  Approch3
{
	public static void main(String[] args)  throws Exception
	{

			new 	sun.jdbc.odbc.JdbcOdbcDriver();		//it has static method ...that calls Internally registerDriver() method
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
