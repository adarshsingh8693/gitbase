package Foreign_Ticket;

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
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Zoo_View.generic.DatabaseUtility;
import com.Zoo_View.generic.File_Lib;
import com.Zoo_View.generic.JavaUtility;
import com.Zoo_View.generic.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_Foreign_Ticket {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		// TODO Auto-generated method stub
		DatabaseUtility dbu=new DatabaseUtility();
		File_Lib fl=new File_Lib();
		JavaUtility ju= new JavaUtility();
		WebDriverUtility wbu=new WebDriverUtility();
		
		/*FileInputStream fis=new FileInputStream("./src/test/resources/commanData.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String Url = pobj.getProperty("url");
		String Browser = pobj.getProperty("browser");
		String User= pobj.getProperty("username");
		String Password= pobj.getProperty("password");
		System.out.println(Url+" "+Browser+" "+User+" "+Password);*/
		
		/* FileInputStream fi=new FileInputStream("./src/test/resources/TestData.xlsx");
	        Workbook wb = WorkbookFactory.create(fi);
	       Sheet sheet = wb.getSheet("create");
	       int row = sheet.getLastRowNum();*/
		wbu.launchTheBrowser();
		WebDriver driver=new ChromeDriver();
	       //WebDriver driver=WebDriverManager.chromedriver().create();
			wbu.maximizeWindow(driver);
			//fl.getDataProperty("Url");
	      // driver.manage().window().maximize();
			
	       driver.get("fl.getDataProperty(\"url\")");
	       
	       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	       driver.findElement(By.xpath("//a[.='Admin'][1]")).click();
	       
	       //log in to app
	       driver.findElement(By.id("username")).sendKeys("fl.getDataProperty(username)");
	       driver.findElement(By.id("password")).sendKeys("fl.getDataProperty(password)");
	       driver.findElement(By.id("form_submit")).click();
	       driver.manage().window().maximize();
	       Thread.sleep(1000);
	       driver.findElement(By.xpath("//span[.='Foreigners Ticket']")).click();
	       driver.findElement(By.linkText("Add Ticket")).click();
	     
	      
	       driver.findElement(By.id("")).sendKeys("");
	       driver.findElement(By.id("")).sendKeys("");
	       driver.findElement(By.id("")).sendKeys("");
	       driver.findElement(By.name("submit")).click();
	       Thread.sleep(3000);
	       
	       WebDriverWait wait=new WebDriverWait(driver, 10);
	       wait.until(ExpectedConditions.alertIsPresent());
	       Alert a=driver.switchTo().alert();
	       String text=a.getText(); 
	       a.accept();
	       if (text.equalsIgnoreCase("Ticket has been generated"))
	    	   System.out.println("Ticket is generated");
	       else
	    	   System.out.println("Ticket is not generated");
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//span[.='Foreigners Ticket']")).click();
           driver.findElement(By.linkText("Manage Ticket")).click();
           
           List<WebElement> visitorName = driver.findElements(By.xpath("//td[3]"));
	       boolean flag=false;
	       System.out.println();
	       for (WebElement e : visitorName) {
			if((e.getText()).equalsIgnoreCase(" "))
			{
				
				flag=true;
				
				break;
			}
			
		}
	       if(flag)
	       {
				System.out.println("added foreign ticket is verified on manage normal ticket page");
				System.out.println("now print the ticket");
				driver.findElement(By.linkText("View")).click();
				driver.findElement(By.xpath("//i[contains(@onclick,'CallPrint')]")).click();
		
				 Robot r=new Robot();
					r.delay(3000);
					r.keyPress(KeyEvent.VK_ENTER);
				System.out.println("ticket is printed");
				
				
	       }
			else
				System.out.println("Foreign ticket is not verified on manage foreign tickrt page");
	       
	}

}
