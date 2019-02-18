package com.orion.automation.Database;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class Databasetest {

	@Test
	public void selectDbdata() throws ClassNotFoundException, SQLException {
		
		String query="select * from student1";
				Database database=new Database();
				
				ResultSet data=database.getData(query);
				System.out.println(data);
				while(data.next()) {
					
					System.out.println(data.getString(1)+" "+data.getString(2));
				}
	}
		
				//@Test
				public void joins() throws ClassNotFoundException, SQLException {
					
					String query="select e2.name,e2.salary from student1 e1,student1 e2 where e1.salary=e2.salary and e1.name='adams'";
					String query1="select * from custo inner join ord on custo.customerid=ord.customerid";
							Database database=new Database();
							
							ResultSet data=database.getData(query);
							System.out.println(data);
							while(data.next()) {
								
								System.out.println(data.getString(1)+" "+data.getString(2));
				
							}
	}
	//@Test
	public void insertDbdata() throws ClassNotFoundException, SQLException {
		
	String query="insert into product values(001,'Tcs','6000')";
				Database database=new Database();
		database.insertData(query);
	}
	//@Test
	public void updateDbdata() throws ClassNotFoundException, SQLException {
		
		String query="update product set productname='tcs' where productid=001";
					Database database=new Database();
			   database.updateData(query);
		}
	
	//@Test
	public void deleteDbdata() throws ClassNotFoundException, SQLException {
		
		String query="delete from product where productid=001";
				Database database=new Database();
		   database.deleteData(query);
				
	}
	
	
}
