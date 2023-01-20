package practice_axesxpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = WebDriverManager.chromedriver().create();
         
         driver.get("https://www.facebook.com/");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
         driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//img[@id='u_g_9_9W']/../img")).click();
         
	}

}
