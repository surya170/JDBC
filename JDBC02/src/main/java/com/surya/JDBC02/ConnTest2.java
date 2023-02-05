package com.surya.JDBC02;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Hello world!
 *
 */
public class ConnTest2 
{
    public static void main( String[] args ) throws Exception
    {
    	// 2. establish the connection 
    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","9014585117");
    	
    	if(con == null) {
    		System.out.println("Connection is not established");
    	}
    	else {
    		System.out.println("Connection is establish");
    	}
    }
}
