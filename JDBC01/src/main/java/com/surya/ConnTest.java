package com.surya;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnTest 
{
    public static void main( String[] args ) throws Exception
    {
    	// 1.Register JDBC driver s/w.
    	// a. Create JDBC driver class object.
    	com.mysql.cj.jdbc.Driver obj = new com.mysql.cj.jdbc.Driver();
    	// Register JDBC driver class object with DriverManager service.
    	DriverManager.registerDriver(obj);
    	// Establish the Connection
    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","9014585117");
    	if(con == null) {
    		System.out.println("Connection is established");
    	}
    	else {
    		System.out.println("Connection is established");
    	}
    }
}
