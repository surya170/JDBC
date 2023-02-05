package com.surya;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class SelectTest3 {
	public static void main(String[] args) throws Exception {
		Scanner sc = null;
		String loc1 = null, loc2 = null, loc3 = null;
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			sc = new Scanner(System.in);
			if (sc != null) {
				System.out.print("Enter Customer Location::");
				loc1 = sc.next().toLowerCase();
				System.out.println("Enter Customer Location::");
				loc2 = sc.next().toLowerCase();
				System.out.println("Enter Customer Location::");
				loc3 = sc.next().toLowerCase();

			}
			// Convert input values as required for SQL Query
			loc1 = "'" + loc1 + "'";
			loc2 = "'" + loc2 + "'";
			loc3 = "'" + loc3 + "'";

			// Load the jdbc Driver Class
			// Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish the connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ntspbms714db", "root", "9014585117");

			// create Statement
			if (con != null) {
				st = con.createStatement();
			}
			// Prepared SQL Query
			String query = "Select custId,custName from realtimedi_customer where custAddrs IN(" + loc1 + "," + loc2 + "," + loc3
					+ ") ORDER BY custAddrs";
			System.out.println(query);

			// send and execute the sql query
			if (st != null) {
				rs = st.executeQuery(query);
			}
			if (rs != null) {
				System.out.println("Employe  details are ::");

				while (rs.next() != false) {
					System.out.println(rs.getInt(1) + " " + rs.getString(2));
				} // while
			} // if
		} // try
		catch (SQLException se) {
			System.out.println(se.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// close the jdbc & stream objs
			try {
				if (rs != null)
					rs.close();
			} // try
			catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (st != null)
					st.close();
			} // try 
			catch (SQLException se) {
				se.printStackTrace();
			}

			try {
				if (con != null)
					con.close();
			} // try
			catch (SQLException se) {
				se.printStackTrace(); 
			}
			try {
				if (sc != null)
					sc.close();
			} // try
			catch (Exception e) {
				e.printStackTrace();
			}

		} // finally
	} // main 
} // class
