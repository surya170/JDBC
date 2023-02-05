package com.surya.JDBC02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class SelectTest 
{
	public static void main( String[] args ) throws Exception
	{
		// 1. Load jdbc driver class
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2. Establish the Connection ( Road ) 
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage","root","9014585117");

		// 3. Create  JDBC Statement object ( it is like vehicle b/w java app and DB s/w. )
		Statement st = con.createStatement();

		// 4. Send and execute SQL Select Query in DB s/w and get JDBC ResultSet object.
		ResultSet rs = st.executeQuery("SELECT * FROM student");

		while(rs.next() != false) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
	}
}
