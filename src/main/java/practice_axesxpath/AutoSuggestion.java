package practice_axesxpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
      
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.Google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> text = driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]/span"));
		for(int i=0;i<text.size();i++)
		{
			System.out.println(text.get(i).getText());
			if(text.get(i).getText().equalsIgnoreCase("selenium download")){
				text.get(i).click();
				Thread.sleep(500);
				break;
				
				
			}
		}
		
	}

}
