package practice_axesxpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoCompleteDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[.='Live Posting']")).click();
		WebElement search = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		Thread.sleep(3000);
		search.clear();
		Thread.sleep(3000);
		search.sendKeys("Toronto");
		String text;
		do {
			Thread.sleep(3000);
			search.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			text=search.getAttribute("value");
			if(text.equalsIgnoreCase("Toronto, OH, USA"))
				Thread.sleep(3000);
				search.sendKeys(Keys.ENTER);
			break;
		}while(!text.isEmpty());
	}

}
