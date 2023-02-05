package com.surya.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	private static Connection con = null;
	static {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ntadvjava", "root", "9014585117");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return con;
	}

	public static void cleanUp() {
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

}
