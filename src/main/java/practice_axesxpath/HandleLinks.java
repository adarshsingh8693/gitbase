package practice_axesxpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLinks {

	public static void main(String[] args) {
         
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Today's Deals")).click();
		//driver.findElement(By.partialLinkText("Deals")).click();
		//how to get the Url of link 
		
		List<WebElement> alllink = driver.findElements(By.tagName("a"));
		int count=0;
		for(int i=0;i<alllink.size();i++)
		{
			System.out.println(count++);
			System.out.println(alllink.get(i).getAttribute("href"));
		}
		
	}

}
