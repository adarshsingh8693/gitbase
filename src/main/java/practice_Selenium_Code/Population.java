
package practice_Selenium_Code;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Population {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement> population = driver.findElements(By.xpath("//h1[.=' Current World Population']/..//div//span"));
		for(int i=0;i<population.size();i++) {
			Thread.sleep(100);
			try {
			System.out.print(population.get(i).getText());
			}
			catch(StaleElementReferenceException e) {
				//e.printStackTrace();
			}
			}

	}

}
