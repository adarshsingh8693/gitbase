package practice_axesxpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
        
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//div[@class='form-check']//label//input"));
		/*for(WebElement sel:checkbox) {
			Thread.sleep(1000);
			sel.click();
		}*/
		//Thread.sleep(3000);
		for(WebElement sel:checkbox) {
			Thread.sleep(1000);
			  String text = sel.getAttribute("id");
			  if(text.equalsIgnoreCase("wednesday")||text.equalsIgnoreCase("thursday")) {
				  
			sel.click();
			Thread.sleep(3000); 
			}
		}
		//select last 2 check boxes

		//Total no of check boxes =no of check boxes want to select=statting index
		//7-2=5
		int totalcheckboxes=checkbox.size();
		System.out.println(totalcheckboxes);
		for(int i=totalcheckboxes-2;i<totalcheckboxes;i++)
		{
			checkbox.get(i).click();
			Thread.sleep(2000);
		}
		
		//select first 3 checkboxes
		for(int i=0;i<totalcheckboxes;i++)
		{
			if(i<3)
			checkbox.get(i).click();
			Thread.sleep(2000);
		}
		
		
	}

}
