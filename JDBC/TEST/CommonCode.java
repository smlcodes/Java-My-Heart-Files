class Demo
	{

		public static void main(String args[])  throws Exception
		{
		
		Class.forName("");

		Connection con = DriverManager.getConnection("", "",  "");

		Statement st = con.createStatement();

		String qry = "  ";

		ResultSet rs = st.executeQuery(qry);

		while(rs.next())
		{
		System.out.println(rs.getString(1)+"		"+rs.getString(2)+"		"+rs.getString(3));
		
		}//while
	
	}//main

}//class

