package com.Zoo_view;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Zoo_View.generic.DatabaseUtility;
import com.Zoo_View.generic.File_Lib;
import com.Zoo_View.generic.JavaUtility;
import com.Zoo_View.generic.WebDriverUtility;

public class Search_ModuleTest {

	public static void main(String[] args) throws Exception {
        
		WebDriverUtility wdu=new WebDriverUtility();
		File_Lib fl=new File_Lib();
		JavaUtility ju=new JavaUtility();
		DatabaseUtility dbu=new DatabaseUtility();
		
		wdu.launchTheBrowser();
		WebDriver driver=new ChromeDriver();
		String Url = fl.getDataProperty("url");
		String user=fl.getDataProperty("username");
		String password=fl.getDataProperty("password");
		driver.get(Url);
		wdu.maximizeWindow(driver);
		driver.findElement(By.xpath("(//a[.='Admin'])[1]")).click();
		 driver.findElement(By.id("username")).sendKeys(user);
	       driver.findElement(By.id("password")).sendKeys(password);
	       driver.findElement(By.id("form_submit")).click();
	       driver.findElement(By.xpath("//span[.='Search']")).click();
	       wdu.waitForPageLoad(driver);
	       driver.findElement(By.linkText("Normal Ticket Search")).click();
	       driver.findElement(By.id("searchdata")).sendKeys("vicky");
	       driver.findElement(By.xpath("//button[@id='submit']")).click();
	       driver.findElement(By.xpath("//div[@class='data-tables']/table/tbody[4]/tr/td[5]/a")).click();
	      System.out.println( driver.findElement(By.xpath("//div[@id='exampl']/h4")).getText());
	       List<WebElement> details = driver.findElements(By.xpath("//div[@id='exampl']/h5"));
	       for(int i=0;i<details.size();i++) {
	    	   System.out.println(details.get(i).getText());
	       }
		
		 
		
		
		
		
		
	}

}
