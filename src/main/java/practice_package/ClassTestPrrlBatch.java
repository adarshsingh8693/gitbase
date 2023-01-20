package practice_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassTestPrrlBatch {

	@Test
	public void Test01() {
		Reporter.log("I m In Test-01)",true);
		System.out.println(Thread.currentThread().getId());
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
	}
	@Test
	public void Test02() {
		Reporter.log("I m In Test-02)",true);
		
	}
	@Test
	public void Test03() {
		Reporter.log("I m In Test-03)",true);
		System.out.println(Thread.currentThread().getId());
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
	}
	@Test
	public void Test04() {
		Reporter.log("I m In Test-04)",true);
		
	}
	
	public void Test05() {
		Reporter.log("I m In Test-05)",true);
	}
}
