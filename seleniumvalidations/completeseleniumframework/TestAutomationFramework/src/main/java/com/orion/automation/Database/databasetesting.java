package com.orion.automation.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class databasetesting {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		// String dbUrl = "jdbc:mysql://localhost:3306/product";					

			//Database Username		
		//	String username = "root";	
         
			//Database Password		
		//	String password = "sql@123";				

			//Query to Execute		
			String query = "select * from product";	
         
  	    //Load mysql jdbc driver		
    	    Class.forName("com.mysql.jdbc.Driver");			
    
    		//Create Connection to DB		
     	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?useSSL=false","root","sql@123");
   
   		//Create Statement Object		
 	   Statement stmt = con.createStatement();					
                        
			// Execute the SQL Query. Store results in ResultSet		
  		     ResultSet rs= stmt.executeQuery(query);		
  	       // While Loop to iterate through all data and print results		
  				while (rs.next()){
  			        		String productid = rs.getString(1);								        
  	                        String productname = rs.getString(2);	
  	                        String productprice = rs.getString(3);
  	                        System. out.println(productid+"     "+productname+"    "+productprice);		
  	                }	
  	  			 // closing DB Connection		
  	  			con.close();

	}

}
