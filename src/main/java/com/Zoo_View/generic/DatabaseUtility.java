    package com.Zoo_View.generic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatabaseUtility {
	
	Connection con=null;
	public void connectTODB() throws Exception {
	Driver driver=new Driver();
	DriverManager.registerDriver(driver);
	con=DriverManager.getConnection(IPathConstants.DBURL,IPathConstants.DBUSERNAME,IPathConstants.DBPASSWORD);
	}	
	
	public String executeQueryAndgetData(String query,int columnIndex,String expData) throws Exception {
		 ResultSet result = con.createStatement().executeQuery(query);
		 boolean flag=false;
		 while(result.next()) {
			 String data=result.getString(columnIndex);
			 System.out.println(data);
			 if(data.equalsIgnoreCase(expData)) {
				 flag=true;
				 break;
			 }
		 }
		 if(flag) {
			 System.out.println("project is created");
		return expData;
		
	}
		 else
		 {
			 System.out.println("project is not Created");
			 return " ";
		 }
		 }
}
