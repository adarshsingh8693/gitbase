package practice_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDataProvider05 extends TestDataProviderconst {

	

	public TestDataProvider05(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	WebDriver driver;
	@Test(dataProvider = "data-provider")
	public void signIn(String username,String password)
	{
		Reporter.log("login",true);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//i[contains(text(),'Login')]")).click();
		String msg = driver.findElement(By.xpath("//div[@id='flash']")).getText();
		Assert.assertEquals(msg.contains("is invalid!"),true);
	}
	
	
	@BeforeTest
	public void setUp()
	{
		Reporter.log("set the path",true);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		Reporter.log("give url",true);
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	
	@AfterTest
	public void closeAut() throws InterruptedException {
		Reporter.log("close the site",true);
		Thread.sleep(2000);
		driver.close();
	}
	
}
