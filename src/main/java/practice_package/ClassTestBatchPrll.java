package practice_package;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Zoo_View.generic.DatabaseUtility;
import com.Zoo_View.generic.File_Lib;
import com.Zoo_View.generic.JavaUtility;
import com.Zoo_View.generic.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassTestBatchPrll {

	
	
	public WebDriver driver;
	public DatabaseUtility dLib=new DatabaseUtility();
	public File_Lib flib=new File_Lib();
	public JavaUtility jLib=new JavaUtility();
	public WebDriverUtility wLib=new WebDriverUtility();
	
	@BeforeMethod
	@Parameters("browser")
	public void crossBrowser(String BROWSER) throws IOException {
	//String BROWSER=flib.getDataProperty("browser");
	//String URL=flib.getDataProperty("url");

	if(BROWSER.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
else if(BROWSER.equalsIgnoreCase("firefox")) {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
}
else
{
	System.out.println("Invalid Browser");
}
	wLib.maximizeWindow(driver);
	wLib.waitForPageLoad(driver);
	
	}
	@Test
	public void openBrowser() {
		Reporter.log("OpenBrowser",true);
		System.out.println(Thread.currentThread().getId());
		driver.get("https://www.google.co.in/");
	}
	@Test
	public void launchBrowser() {
		Reporter.log("LaunchBrowser",true);
		System.out.println(Thread.currentThread().getId());
		driver.get("https://www.makemytrip.com/flights/");
		
	}
	
	public void login() {
		Reporter.log("Login",true);
	}
	
	public void searchProduct() {
		Reporter.log("SearchProduct",true);
	}
	
	public void addToCart() {
		Reporter.log("AddToCart",true);
	}
	
	public void logOut() {
		Reporter.log("Logout",true);
	}
	@AfterMethod
	public void closeBrowser() {
		Reporter.log("CloseBrowser",true);
		driver.quit();
	}
	
}
