package practice_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadDataFromDataBase {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
	try {	    
		Driver driver=new Driver();
		//Step1 Register the Databases
		DriverManager.registerDriver(driver);
		//step 2-getconnection for the databases
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet45","root","root");
		//step3 issue create Statement
		Statement state = con.createStatement();
		String query="Select * from studentinfo;";
		//step 4 Execute Query
		ResultSet result = state.executeQuery(query); 
		//step 5 close the database
		while(result.next())
		{
			System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4)); 
		}
	}
	catch(Exception e) {
		
	}
	finally {
		con.close();
		System.out.println("close the databases connection succesfully");
	}
		
		
		
		
		

	}

}
