//ByLikeLetter2	---------->		select * from student where sname like 's%' and sadd like 'h%';

import java.sql.*;
import java.util.*;

class  ByLikeLetter2
{
	public static void main(String[] args)		throws Exception
	{

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn","system","a");	

		Statement st = con.createStatement();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name Startng Letter	 :	");
		String s1 = sc.next();

		System.out.println("Enter Address Startng Letter	 :	");
		String s2 = sc.next();

		String qry	= 	"select * from student where sname like '"+s1+"%' and sadd like '"+s2+"%'";

		ResultSet rs = st.executeQuery(qry);

		while(rs.next())
		{
		System.out.println(rs.getString(1)+"		"+rs.getString(2)+"		"+rs.getString(3));
		}
		
	}


}
