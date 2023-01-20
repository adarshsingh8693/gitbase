package practice_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opentheapplication {
	

	public static void main(String[] args) throws InterruptedException, SQLException {
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://rmgtestingserver:8084/");
		driver.findElement(By.id("usernmae")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[.='Sign in']")).click();
		driver.findElement(By.linkText("Projects")).click();
		driver.findElement(By.xpath("//span[.='Create Project']")).click();
		
		
		
		
		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys("sap");
		driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("ad");
		Thread.sleep(5000);
		WebElement dropdown = driver.findElement(By.xpath("(//select[@name='status'])[2]"));
		
		Select s=new Select(dropdown);
		
		s.selectByValue("Created");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();*/
		String actualpro="sapience";
		Connection con=null;
		try {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		con=DriverManager.getConnection("jdbc:mysql: //rmgtestingserver:3333/projects","root@%","root");
		Statement state = con.createStatement();
		String query = "select * from project where created_by='adarsh';";
		            ResultSet result = state.executeQuery(query);  
		while(result.next()) {
		String createdpro = result.getString(4);
		if(actualpro.equalsIgnoreCase(createdpro)) 
			System.out.println("Project Created Succesfully");
		
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			con.close();
		}
	}

}
