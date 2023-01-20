package practice_axesxpath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckDropDownSorted {

	public static void main(String[] args) throws InterruptedException {
		ArrayList al=new ArrayList();
		ArrayList aryl=new ArrayList();
         
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Live Posting')]")).click();
		//Alert a = driver.switchTo().alert();
		//a.accept();
		WebElement list = driver.findElement(By.xpath("//select[@name='category_id']"));
		Select s=new Select(list);
		List<WebElement> option = s.getOptions();
		for(int i=0;i<option.size();i++) {
			Thread.sleep(300);
			System.out.print(option.get(i).getText()+"   ");
              al.add(option.get(i).getText());
              aryl.add(option.get(i).getText());
              
		}
		
		Collections.sort(aryl);
		System.out.println();
		System.out.print(aryl);
		for(int i=0;i<al.size();i++) {
			
			if(al.get(i).equals(aryl.get(i)))
			{
				System.out.println("it is sorted");
			}
			else
			{
				System.out.println("it is not sorted");
				break;
			}
		}
		
		
		
		
	}

}
