package practice_Selenium_Code;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrganizationName {

	public static void main(String[] args) throws InterruptedException {
   
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://rmgtestingserver:8888/index.php?module=Accounts&action=index");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		List<WebElement> set = driver.findElements(By.xpath("//tr[@class='lvtColData']//td[3]"));
		for(int i=0;i<set.size();i++) {
			Thread.sleep(2000);
			System.out.println(set.get(i).getText());
		}
		
	}

}
