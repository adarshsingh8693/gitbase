package com.Zoo_view;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteNormalTicketTest {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		  
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
			       Thread.sleep(1000);
			       driver.findElement(By.xpath("//a[.='Normal Ticket']")).click();
			       driver.findElement(By.linkText("Add Ticket")).click();
			       driver.findElement(By.id(sheet.getRow(7).getCell(0).toString())).sendKeys(sheet.getRow(7).getCell(1).toString());
			       driver.findElement(By.id(sheet.getRow(8).getCell(0).toString())).sendKeys(sheet.getRow(8).getCell(1).toString());
			       driver.findElement(By.id(sheet.getRow(9).getCell(0).toString())).sendKeys(sheet.getRow(9).getCell(1).toString());
			       driver.findElement(By.name("submit")).click();
			       WebDriverWait wait=new WebDriverWait(driver, 10);
			       wait.until(ExpectedConditions.alertIsPresent());
			       Alert a=driver.switchTo().alert();
			       String text=a.getText();
			       a.accept();
			       if (text.equalsIgnoreCase("Ticket has been generated"))
			    	   System.out.println("Ticket is generated");
			       else
			    	   System.out.println("Ticket is not generated");
			       driver.findElement(By.xpath("//a[.='Normal Ticket']")).click();
			       driver.findElement(By.xpath("//a[.='Manage Ticket']")).click();
			       
			       List<WebElement> visitorName = driver.findElements(By.xpath("//td[3]"));
			       boolean flag=false;
			       System.out.println(sheet.getRow(7).getCell(1).toString());
			       for (WebElement e : visitorName) {
					if((e.getText()).equalsIgnoreCase(sheet.getRow(7).getCell(1).toString()))
					{
						
						flag=true;
						
						break;
					}
					
				}
			       if(flag)
			       {
						System.out.println("added normal ticket is verified on manage normal ticket page");
						System.out.println("now delete the ticket");
						driver.findElement(By.linkText("Delete")).click();
						Alert a3=driver.switchTo().alert();
					       a3.accept();
					       Alert a4=driver.switchTo().alert();
					       String text3=a.getText();
					       a4.accept();
					       if (text3.equalsIgnoreCase("Data Deleted"))
					    	   System.out.println("Normal ticket is deleted");
					       else
					    	   System.out.println("Normal ticket is not deleted");
					       Thread.sleep(9000);
						
						
						
			       }
					else
						System.out.println("normal ticket is not verified on manage normal tickrt page");
			       

	}

}