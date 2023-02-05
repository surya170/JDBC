package com.surya;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;

public class Test 
{
    public static void main( String[] args ) throws Exception
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	while(true) {
    		System.out.println();
    		System.out.println("1.Admin");
    		System.out.println("2.Normal");
    		System.out.println("3.Exit");
    		System.out.println("Your option [1,2,3] : ");
    		int option = Integer.parseInt(br.readLine());
    		
    		switch (option) {
			case 1:
				System.out.println("===========1.Admin Module ==============");
				int id = br.read();
				
				break;

			default:
				break;
			}
    	}
    }
}
