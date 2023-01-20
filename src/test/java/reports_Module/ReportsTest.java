package reports_Module;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Zoo_View.generic.BaseClass;
import com.Zoo_View.generic.DatabaseUtility;
import com.Zoo_View.generic.File_Lib;
import com.Zoo_View.generic.WebDriverUtility;
import com.Zoo_View.objectresporatory.LoginPage;
import com.Zoo_View.objectresporatory.NormalReportPage;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(com.Zoo_View.generic.ListernersImplemantion.class)
public class ReportsTest extends BaseClass{
	
    @Test        //(retryAnalyzer = com.Zoo_View.generic.ReTryImpclass.class)
	public void test() throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
				/*FileInputStream fis=new FileInputStream("./src/test/resources/commanData.properties");
				Properties pobj=new Properties();
				pobj.load(fis);
				String Url = pobj.getProperty("url");
				String Browser = pobj.getProperty("browser");
				String User= pobj.getProperty("username");
				String Password= pobj.getProperty("password");
				System.out.println(Url+" "+Browser+" "+User+" "+Password);*/
				
				 /*FileInputStream fi=new FileInputStream("./src/test/resources/TestData.xlsx");
			        Workbook wb = WorkbookFactory.create(fi);
			       Sheet sheet = wb.getSheet("create");
			       int row = sheet.getLastRowNum();*/
			      // WebDriver driver=WebDriverManager.chromedriver().create();
		          
					
			      // driver.manage().window().maximize();
			      // driver.get(fl.getDataProperty("url"));
			       //wdu.waitForPageLoad(driver);
			       //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			       //driver.findElement(By.xpath("//a[.='Admin'][1]")).click();
			       //String usernameVal = fl.getDataProperty("username");
			       //String passwordVal = fl.getDataProperty("password");
			    //   LoginPage lg=new LoginPage(driver);
			    	//	   lg.logInPage(usernameVal, passwordVal);
			      
			       //log in to app
			      /* driver.findElement(By.id("username")).sendKeys(User);
			       driver.findElement(By.id("password")).sendKeys(Password);
			       driver.findElement(By.id("form_submit")).click();
			      wdu.maximizeWindow(driver);
			      // driver.manage().window().maximize();
			       Thread.sleep(1000);*/
			       NormalReportPage nr=new NormalReportPage(driver);
			       nr.enterDate();
			      /* driver.findElement(By.xpath("//span[.='Reports']")).click();
			       driver.findElement(By.linkText("Normal People Report")).click();
			       driver.findElement(By.id("fromdate")).click();*/
			       Robot r=new Robot();
			       
			      Thread.sleep(1000);
			       r.keyPress(KeyEvent.VK_1);
			       Thread.sleep(100);
			       r.keyPress(KeyEvent.VK_2);
			       Thread.sleep(1000);
			       r.keyPress(KeyEvent.VK_1);
			       Thread.sleep(100);
			       r.keyPress(KeyEvent.VK_7);
			       Thread.sleep(1000);
			       r.keyPress(KeyEvent.VK_2);
			       r.keyPress(KeyEvent.VK_0);
			       r.keyPress(KeyEvent.VK_2);
			       
			       r.keyPress(KeyEvent.VK_2);
			     
			       nr.todate();
			      // driver.findElement(By.id("todate")).click();
			       
			       
			     /* r.delay(2000);
			       r.keyPress(KeyEvent.VK_1);
			      // r.delay(2000);
			       r.keyPress(KeyEvent.VK_2);
			      r.delay(2000);
			       r.keyPress(KeyEvent.VK_2);
			       r.delay(2000);
			       r.keyPress(KeyEvent.VK_7);
			      r.delay(1000);
			       r.keyPress(KeyEvent.VK_2);
			       r.keyPress(KeyEvent.VK_0);
			       r.keyPress(KeyEvent.VK_2);
			       r.delay(2000);
			       r.keyPress(KeyEvent.VK_2);
			       
			       driver.findElement(By.xpath("//button[.='Submit']")).submit();*/
			       //driver.findElement(By.linkText("View")).click();
			       Thread.sleep(2000);
			       List<WebElement> getname = driver.findElements(By.xpath("//tr[@data-expanded='true']/td[3]"));
			      System.out.println( getname.size());
			       for(WebElement name:getname) {
			    	  
			    	   System.out.println(name.getText());
			       }
			       driver.findElement(By.linkText("View")).click();
				      String totalprice = driver.findElement(By.xpath("//tr[4]/td")).getText();
				      Assert.fail();
				      System.out.println(totalprice);  
			       
			       
	}

}
