import java.sql.*;
import java.io.*;
import java.util.*;


/*
class Demo 
{
	public static void main(String[] args)  throws SQLException,IOException,Exception
	{

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn","system","a");

		if(con!=null)
		System.out.println("Connection ok");

		else
			System.out.println("Not ok");
	}
}


String qry = "select *from dual";

System.out.println(rs.getString(1));

String qry = "select rowid,sno,sname from student";




class Demo 
{
	public static void main(String[] args)  throws SQLException,IOException,Exception
	{

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn","system","a");

		Statement st = con.createStatement();

				String qry = "select rownum,sno,sname from student";

		ResultSet rs = st.executeQuery(qry);

		while(rs.next())
		{
		
		System.out.println(rs.getString(1)+"		"+rs.getString(2)+"		"+rs.getString(3));
		
		}//while

}//main

}//class


//APP1: SMPLE SELECT STATEMENT


	class Demo
	{

		public static void main(String args[])  throws Exception
		{
		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn", "system",  "a");

		Statement st = con.createStatement();

		String qry = "select * from student  ";

		ResultSet rs = st.executeQuery(qry);

		while(rs.next())
		{
		System.out.println(rs.getString(1)+"		"+rs.getString(2)+"		"+rs.getString(3));
		
		}//while
	
	}//main

}//class


	

		
	
//APP  : simple delete statemet

class Demo
	{

		public static void main(String args[])  throws Exception
		{
		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn", "system",  "a");

		Statement st = con.createStatement();

		String qry = "delete from student where sno = 102";

		int  rs = st.executeUpdate(qry);

		
		System.out.println(rs);
		
		
	}//main

}//class



//APP3  : simple inster statemet

class Demo
	{

		public static void main(String args[])  throws Exception
		{
		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn", "system",  "a");

		Statement st = con.createStatement();

		Scanner sc = new Scanner(System.in);

		System.out.println("Nuber	:		");
		int sno = sc.nextInt();

		System.out.println("Name	:		");
		String  name = sc.next();

		System.out.println("Address	:		");
		String  add= sc.next();


		String qry = "insert into student values("+ sno+",'"+name+"', '"+add+"')";

		int  rs = st.executeUpdate(qry);

		
		System.out.println(rs);
		
		
	}//main

}//class






//APP  : Update

class Demo
	{

		public static void main(String args[])  throws Exception
		{
		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn", "system",  "a");

		Statement st = con.createStatement();

	
		String qry = "update student set sname = 'SATYA' where sno = 192";

		int  rs = st.executeUpdate(qry);

		
		System.out.println(rs);
		
		
	}//main

}//class





//APP4  :  simple inster Using preparedStatement

class Demo
	{

		public static void main(String args[])  throws Exception
		{
		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn", "system",  "a");

		String qry = "insert into student values(?, ?, ?)";

		PreparedStatement  st = con.prepareStatement(qry);

		Scanner sc = new Scanner(System.in);

		System.out.println("How many values u want to enter		");
		int n = sc.nextInt();

				int result = 0;

		
		for(int i=1; i<=n; i++ )
			{
		System.out.println("Nuber	:		");
		int sno = sc.nextInt();

		System.out.println("Name	:		");
		String  name = sc.next();

		System.out.println("Address	:		");
		String  add= sc.next();

		st.setInt(1,sno);
		st.setString(2,name);
		st.setString(3,add);

		int  rs = st.executeUpdate();

		 result = rs+result;

			}
		
		System.out.println("Records inserted"+result);
		
		
	}//main

}//class

*/

//APP  : 

//APP  : 

//APP  : 

//APP  : 

//APP  : 

//APP  : 

//APP  : 

//APP  : 

//APP  : 

//APP  : 

