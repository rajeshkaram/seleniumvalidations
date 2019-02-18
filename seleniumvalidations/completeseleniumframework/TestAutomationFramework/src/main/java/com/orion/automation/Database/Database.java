package com.orion.automation.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	
		
		public Connection con;
		public Statement stmt;
		
		public Statement getStatement() throws ClassNotFoundException, SQLException{
			try {
				String driver = "com.mysql.jdbc.Driver";
				String connection = "jdbc:mysql://localhost:3306/sys";
				String userName = "root";
				String password = "sql@123";
				Class.forName(driver);
				con = DriverManager.getConnection(connection, userName, password);
				stmt = con.createStatement();
				return stmt;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return stmt;
		}
		
		
		//insert data
		public void insertData(String query) throws ClassNotFoundException, SQLException{
			Statement sta = getStatement();
			sta.executeUpdate(query);
		}
		//result
		public ResultSet getData(String query) throws ClassNotFoundException, SQLException{
			ResultSet data = getStatement().executeQuery(query);
			return data;
		}
		//update data
		public void updateData(String query) throws ClassNotFoundException, SQLException{
			getStatement().executeUpdate(query);
			
		}
		
		//delete data
	    public void deleteData(String query) throws ClassNotFoundException, SQLException {
	     getStatement().executeUpdate(query);
		
	}
	    
	    
}



