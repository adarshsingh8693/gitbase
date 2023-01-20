package practice_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassTestBatchParrel {

	
	@Test
	public void openBrowser() {
		Reporter.log("OpenBrowser",true);
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
	}
	@Test
	public void launchBrowser() {
		Reporter.log("LaunchBrowser",true);
		
	}
	@Test
	public void login() {
		Reporter.log("Login",true);
	}
	@Test
	public void searchProduct() {
		Reporter.log("SearchProduct",true);
	}
	@Test
	public void addToCart() {
		Reporter.log("AddToCart",true);
	}
	@Test
	public void logOut() {
		Reporter.log("Logout",true);
	}
	@Test
	public void closeBrowser() {
		Reporter.log("CloseBrowser",true);
	}
	@Test
	public void loseBrowser() {
		Reporter.log("loseBrowser",true);
	}
}
