package practice_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mock {

	public static void main(String[] args) throws InterruptedException {
        
		String date="//div[@aria-label='Sun Jan 01 2023']";		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/flights/");
		driver.findElement(By.xpath("//span[.='Round-trip']")).click();
		driver.findElement(By.xpath("//span[.='Departure']/../p[1]")).click();
		
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[@aria-label='Sat Jan 21 2023']")).click();
				break;
			}
			catch(Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Return']/../p[1]")).click();
		String date2="";
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[@aria-label='Fri Jun 02 2023']")).click();
				break;
			}
			catch(Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				
			}
		}
	}

}
