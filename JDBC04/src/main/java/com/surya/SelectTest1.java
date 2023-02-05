package com.surya;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class SelectTest1 
{
    public static void main( String[] args ) throws Exception
    {
    	 // Read inputs
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the Principal Amount :: ");
    	int PAmount = sc.nextInt();
    	System.out.print("Enter the Interest Amount :: ");
    	int IAmount = sc.nextInt();
    	
    	// 1. Register the jdbc driver s/w to load  jdbc driver class ( optional ) 
    	    // Class.forName("com.mysql.cj.jdbc.Driver");   // optional
    	
    	// 2. Establish the connection with MySql DB s/w.
    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ntspbms714db","root","9014585117");
    	//System.out.println(con.getClass());
    	
    	// 3. Create Statement Object
    	Statement st = con.createStatement();
    	//System.out.println(st.getClass());
    	
        // 4. Prepare SQL Query 
    	String query = "SELECT CustId,CustName,custAddrs FROM realtimedi_customer WHERE pamt >="+PAmount+" AND intrAmount >="+IAmount+"";
    	
    	System.out.println(query);
    	
    	// Send and execute the sql query in DB S/w
          ResultSet rs = st.executeQuery(query);
        // Process the result object 
          System.out.println("Customer details having salary range"+PAmount+"....."+IAmount);
        
          while(rs.next() != false) {
        	  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
          }
          
       //close jdbc objects
          rs.close();
          st.close();
          con.close();     
    } // main
    
} // class 
