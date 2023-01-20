package practice_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class NonSelectqueryTest {

	public static void main(String[] args) throws SQLException {
		Connection con=null;   
		int result=0;
		try {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet45","root","root");
		Statement state = con.createStatement();
		String query = "insert into studentinfo  values('NITHISH','bTM','APPIUM',1);";
		 result = state.executeUpdate(query);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(result==1) {
				System.out.println("Data insert succesfully");
			}
			else
			{
				System.out.println("data ni insert succesfully");
			}
			con.close();
		}
		
	}

}
