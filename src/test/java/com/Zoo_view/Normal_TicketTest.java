package com.Zoo_view;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Zoo_View.generic.BaseClass;
import com.Zoo_View.generic.DatabaseUtility;
import com.Zoo_View.generic.File_Lib;
import com.Zoo_View.generic.WebDriverUtility;
import com.Zoo_View.objectresporatory.AddTicketPage;
import com.Zoo_View.objectresporatory.LoginPage;
import com.Zoo_View.objectresporatory.ManageNormalTicketPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Normal_TicketTest extends BaseClass{
     @Test
	public  void nor_Tic() throws EncryptedDocumentException, IOException, InterruptedException, AWTException {

		  
		/*FileInputStream fis=new FileInputStream("./src/test/resources/commanData.properties");
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
	       int row = sheet.getLastRowNum();*/
		 /*DatabaseUtility db=new DatabaseUtility();
         File_Lib fl=new File_Lib();
         WebDriverUtility wdu=new WebDriverUtility();
	       WebDriverManager.chromedriver().setup();
	       WebDriver driver=new ChromeDriver();
	     
	       driver.get(fl.getDataProperty("url"));
	       wdu.waitForPageLoad(driver);
	       driver.findElement(By.xpath("//a[.='Admin'][1]")).click();
	       String usernameVal = fl.getDataProperty("username");
	       String passwordVal = fl.getDataProperty("password");
	       LoginPage lg=new LoginPage(driver);
	    		   lg.logInPage(usernameVal, passwordVal);
	    		   wdu.maximizeWindow(driver);
	       //driver.manage().window().maximize();
	       //driver.get(Url);
	       //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	      // driver.findElement(By.xpath("//a[.='Admin'][1]")).click();
	       
	       //log in to app
	      /* driver.findElement(By.id("username")).sendKeys(User);
	       driver.findElement(By.id("password")).sendKeys(Password);
	       driver.findElement(By.id("form_submit")).click();
	       driver.manage().window().maximize();*/
	       Thread.sleep(1000);
	       /*driver.findElement(By.xpath("//a[.='Normal Ticket']")).click();
	       driver.findElement(By.linkText("Add Ticket")).click();
	       driver.findElement(By.id(sheet.getRow(7).getCell(0).toString())).sendKeys(sheet.getRow(7).getCell(1).toString());
	       driver.findElement(By.id(sheet.getRow(8).getCell(0).toString())).sendKeys(sheet.getRow(8).getCell(1).toString());
	       driver.findElement(By.id(sheet.getRow(9).getCell(0).toString())).sendKeys(sheet.getRow(9).getCell(1).toString());
	       driver.findElement(By.name("submit")).click();*/
	       AddTicketPage addtp=new AddTicketPage(driver);
	       addtp.addNorTicKDetail("golu56", "1", "1");
	       WebDriverWait wait=new WebDriverWait(driver, 10);
	       wait.until(ExpectedConditions.alertIsPresent());
	      String text = wLib.acceptAlert(driver);
	       if (text.equalsIgnoreCase("Ticket has been generated"))
	    	   System.out.println("Ticket is generated");
	       else
	    	   System.out.println("Ticket is not generated");
	       Thread.sleep(300);
	      driver.findElement(By.xpath("//a[.='Normal Ticket']")).click();
	      Thread.sleep(300);
	      ManageNormalTicketPage mn=new ManageNormalTicketPage(driver);
	      mn.detailofvisitor();
	       /* driver.findElement(By.xpath("//a[.='Manage Ticket']")).click();
	       
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
				System.out.println("now print the ticket");
				driver.findElement(By.linkText("View")).click();
				driver.findElement(By.xpath("//i[contains(@onclick,'CallPrint')]")).click();
		
				 Robot r=new Robot();
					r.delay(3000);
					r.keyPress(KeyEvent.VK_ENTER);
				System.out.println("ticket is printed");
				
				
	       }
			else
				System.out.println("normal ticket is not verified on manage normal tickrt page");*/
	       
	     
	       
		
	}

}
