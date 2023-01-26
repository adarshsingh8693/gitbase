package com.Zoo_view;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ManageTypeTicketTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       System.out.println("press 1 to edit normal adult");
	       System.out.println("press 2 to edit normal child");
	       System.out.println("press 3 to edit foreigner adult");
	       System.out.println("press 4 to edit foreigner child");
	       int no=sc.nextInt();
	       System.out.println("enter the price");
	       
	       String price=sc.next();
	      // Thread.sleep(5000);
		
		FileInputStream fis=new FileInputStream("./src/test/resources/commanData.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String Url = pobj.getProperty("url");
		String Browser = pobj.getProperty("browser");
		String User= pobj.getProperty("username");
		String Password= pobj.getProperty("password");
		System.out.println(Url+" "+Browser+" "+User+" "+Password);
		
		 FileInputStream fi=new FileInputStream("./src/test/resources/TestData.xlsx");
	        Workbook wb = WorkbookFactory.create(fi);
	       Sheet sheet = wb.getSheet("create");
	       int row = sheet.getLastRowNum();
	       
	       WebDriver driver=WebDriverManager.chromedriver().create();
			
	       driver.manage().window().maximize();
	       driver.get(Url);
	       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	       driver.findElement(By.xpath("//a[.='Admin'][1]")).click();
	       
	       //log in to app
	       driver.findElement(By.id("username")).sendKeys(User);
	       driver.findElement(By.id("password")).sendKeys(Password);
	       driver.findElement(By.id("form_submit")).click();
	       driver.manage().window().maximize();
	       driver.findElement(By.partialLinkText("Manage Type Ticket")).click();
	       switch (no) {
			case 1:{
				driver.findElement(By.xpath("(//td[4])[1]")).click();
			       driver.findElement(By.id("tprice")).sendKeys(Keys.CONTROL+"a");
			       driver.findElement(By.id("tprice")).sendKeys(price);
			       driver.findElement(By.name("submit")).click();
				
				break;
			}
			case 2:
			{
				driver.findElement(By.xpath("(//td[4])[2]")).click();
				 Thread.sleep(3000);
				 driver.findElement(By.id("tprice")).sendKeys(Keys.CONTROL+"a");
				 Thread.sleep(3000);
			       driver.findElement(By.id("tprice")).sendKeys(price);
			       Thread.sleep(3000);
			       driver.findElement(By.name("submit")).click();
			       Thread.sleep(3000);
			
			break;
			}
			case 3: {
				driver.findElement(By.xpath("(//td[4])[3]")).click();
				 driver.findElement(By.id("tprice")).sendKeys(Keys.CONTROL+"a");
			       driver.findElement(By.id("tprice")).sendKeys(price);
			       driver.findElement(By.name("submit")).click();
			
			break;
			}
			case 4:{
				driver.findElement(By.xpath("(//td[4])[4]")).click();
				 driver.findElement(By.id("tprice")).sendKeys(Keys.CONTROL+"a");
			       driver.findElement(By.id("tprice")).sendKeys(price);
			       driver.findElement(By.name("submit")).click();
			
			break;
			}

			default:
				System.out.println("invalid input");
				
	       }
	       WebDriverWait wait=new WebDriverWait(driver, 10);
	       wait.until(ExpectedConditions.alertIsPresent());
	       Alert a=driver.switchTo().alert();
	       String text=a.getText();
	       a.accept();
	       if (text.equalsIgnoreCase("Ticket detail has been Updated."))
	    	   System.out.println("Ticket price is updated");
	       else
	    	   System.out.println("Ticket details is not updated");
	       Thread.sleep(9000);

	}

}
