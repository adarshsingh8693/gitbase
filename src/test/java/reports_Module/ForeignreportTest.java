package reports_Module;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
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
import com.Zoo_View.objectresporatory.ForeignReportPage;
import com.Zoo_View.objectresporatory.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(com.Zoo_View.generic.ListernersImplemantion.class)
public class ForeignreportTest extends BaseClass{

	@Test
	public void ForeignTest() throws Exception {

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
	      // WebDriver driver=WebDriverManager.chromedriver().create();
		/* DatabaseUtility db=new DatabaseUtility();
         File_Lib fl=new File_Lib();
         WebDriverUtility wdu=new WebDriverUtility();
	       WebDriver driver=wdu.launchTheBrowser();
			
	      /* driver.manage().window().maximize();
	       driver.get(Url);
	       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);*/
	       
	      /* driver.get(fl.getDataProperty("url"));
	       wdu.waitForPageLoad(driver);
	       wdu.maximizeWindow(driver);
	      
	       
	       //log in to app
	       /*driver.findElement(By.id("username")).sendKeys(User);
	       driver.findElement(By.id("password")).sendKeys(Password);
	       driver.findElement(By.id("form_submit")).click();
	       driver.manage().window().maximize();
	       String user = fl.getDataProperty("username");
	       String pssd = fl.getDataProperty("password");
	       LoginPage lg=new LoginPage(driver);
	       lg.logInPage(user, pssd);*/
	       
	      /* driver.findElement(By.xpath("//span[.='Reports']")).click();
	       driver.findElement(By.linkText("Foreigner People Report")).click();
	       driver.findElement(By.id("fromdate")).click();*/
	       
	       ForeignReportPage frt=new ForeignReportPage(driver);
	       frt.enterDate();
	      
	    
		Thread.sleep(2000);
	       //frt.enterDate();
	       
	       
	       Robot r=new Robot();
	       
	      
	       r.keyPress(KeyEvent.VK_1);
	       r.delay(1000);
	       r.keyPress(KeyEvent.VK_2);
	       r.delay(1000);
	       r.keyPress(KeyEvent.VK_1);
	       r.delay(1000);
	       r.keyPress(KeyEvent.VK_7);
	      r.delay(1000);
	       r.keyPress(KeyEvent.VK_2);
	       r.keyPress(KeyEvent.VK_0);
	       r.keyPress(KeyEvent.VK_2);
	       r.delay(1000);
	       r.keyPress(KeyEvent.VK_2);
	       Thread.sleep(1000);
	       //driver.findElement(By.id("todate")).click();
	       frt.todate();
	       
	       
	      /*r.delay(2000);
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
	       r.keyPress(KeyEvent.VK_2);*/
	       
	       //driver.findElement(By.xpath("//button[.='Submit']")).submit();
	       Thread.sleep(1000);
	       //Assert.fail();
	       driver.findElement(By.linkText("View")).click();
	       Thread.sleep(2000);
	       List<WebElement> getname = driver.findElements(By.xpath("//tr[@data-expanded='true']/td[3]"));
	      System.out.println( getname.size());
	       for(WebElement name:getname) {
	    	   Thread.sleep(100);
	    	   System.out.println(name.getText());
	       }
	       driver.findElement(By.linkText("View")).click();
		      String totalprice = driver.findElement(By.xpath("//tr[4]/td")).getText();
		      System.out.println(totalprice);  
	       
	       
}



	}


