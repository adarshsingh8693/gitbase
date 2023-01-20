package com.Zoo_view;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Zoo_View.generic.DatabaseUtility;
import com.Zoo_View.generic.File_Lib;
import com.Zoo_View.generic.JavaUtility;
import com.Zoo_View.generic.WebDriverUtility;

public class Check_navigationTest {
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
	       driver.findElement(By.xpath("//div[@class='nav-btn pull-left']/span[2]")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//div[@class='row align-items-center']/div[@class='col-md-6 col-sm-8 clearfix']/div")).click();
	       driver.findElement(By.xpath("//a[@aria-expanded='true']//span[.='Dashboard']")).click();
	       //driver.findElement(By.xpath(""))
	       List<WebElement> total = driver.findElements(By.xpath("//div[@class='single-report']/descendant::div[2]/h3"));
	       
	       List<WebElement> price = driver.findElements(By.xpath("//div[@class='single-report']/descendant::div[2]/h3/following-sibling::p"));
	       for(int i=0;i<total.size();i++) {
	    	   Thread.sleep(300);
	    	   System.out.println(total.get(i).getText()+"----->"+price.get(i).getText());
	       }

}
}