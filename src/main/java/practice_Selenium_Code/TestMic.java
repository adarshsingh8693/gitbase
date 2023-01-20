package practice_Selenium_Code;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMic {

	public static void main(String[] args) throws AWTException, InterruptedException {
           
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://mictests.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("(//div[@class='yuRUbf'])[1]//a//h3[.='Mic Test']")).click();
		//Alert a = driver.switchTo().alert();
		//a.accept();
		driver.findElement(By.xpath("//div[@id='mic-controls']//button[@id='mic-launcher']")).click();
	Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
	//driver.findElement(By.id("mic-launcher")).click();	
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='mic-notices']//li[@class='notice-done done_testingComplete']")));
		String data = driver.findElement(By.xpath("//ul[@id='mic-notices']//li[@class='notice-done done_testingComplete']")).getText();
		System.out.println(data);
		driver.close();
	}

}
