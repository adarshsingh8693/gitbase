package com.Zoo_View.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.Zoo_View.objectresporatory.DashboardPage;
import com.Zoo_View.objectresporatory.LoginPage;
import com.Zoo_View.objectresporatory.ZooManagePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public  WebDriver driver;
	public static WebDriver sdriver;
	public DatabaseUtility dLib=new DatabaseUtility();
	public File_Lib flib=new File_Lib();
	public JavaUtility jLib=new JavaUtility();
	public WebDriverUtility wLib=new WebDriverUtility();
	
	@BeforeSuite
	public void configDB() throws Exception
	{
		//dLib.connectTODB();
		System.out.println("connect the database");
	}
	
	//@Parameters("BROWSER")
	@BeforeClass
	public void configBc() throws IOException, InterruptedException {
		
		
		
		String BROWSER=flib.getDataProperty("browser");
		String URL=flib.getDataProperty("url");
		
	System.out.println(BROWSER);
	System.out.println(URL);
	
		if(BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
	else if(BROWSER.equalsIgnoreCase("firefox")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	else if(BROWSER.equalsIgnoreCase("IE"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	
		sdriver=driver;
		
	driver.get(URL);	
    wLib.waitForPageLoad(driver);
	wLib.maximizeWindow(driver);
		
		}
		
	@BeforeMethod
	public void configBM() throws IOException, InterruptedException {
		//String BROWSER=flib.getDataProperty("browser");
		//String URL=flib.getDataProperty("url");
		Thread.sleep(1000);
		
		ZooManagePage zmg=new ZooManagePage(driver);
		
		WebElement ad = zmg.getAdmin();
		ad.click();
		String USERNAME=flib.getDataProperty("username");
		String PASSWORD=flib.getDataProperty("password");
		
		
		LoginPage lg=new LoginPage(driver);
		lg.logInPage(USERNAME, PASSWORD);
		System.out.println("-----Login To App-----");
		
	}
	@AfterMethod
      public void configAM() {
		
		DashboardPage dsp=new DashboardPage(driver);
		dsp.getAdmin().click();
		dsp.getLogout().click();
		
		
	}
	@AfterClass
	public void configAC() {
		driver.quit();
		System.out.println("-----close the Browser---");
	}
	
	public void disconnectDB() {
		//dLib.
		System.out.println("close the dataBase");
	}
	
}
