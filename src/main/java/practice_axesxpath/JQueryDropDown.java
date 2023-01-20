package practice_axesxpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropDown {

	public static void main(String[] args) throws InterruptedException {
        
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		List<WebElement> jquery = driver.findElements(By.xpath("//li[@class='ComboTreeItemChlid']"));
		for(WebElement sel:jquery) {
			Thread.sleep(1000);
			sel.click();
		}
		
	}

}
