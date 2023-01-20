package practice_axesxpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=WebDriverManager.chromedriver().create();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
      WebElement dropdown = driver.findElement(By.xpath("//select[@id='input-country']"));
      choose(dropdown,"Cuba");
     // Select s=new Select(dropdown);
      //s.selectByVisibleText("India");
      
     // selecting option from dropdown without using methods
      
      //List<WebElement> ele = s.getOptions();
     /* for(WebElement option:ele)
      {
    	  if(option.getText().equals("Cuba"))
    	  {
    		  option.click();
    		  break;
    	  }
      }*/
      
                    
	}

	public static void choose(WebElement ele,String text) throws InterruptedException
	{
		Thread.sleep(500);
		Select s=new Select(ele);
		 List<WebElement> alloption= s.getOptions();
	      for(WebElement option:alloption)
	      {
	    	  if(option.getText().equals("Cuba"))
	    	  {
	    		  option.click();
	    		  
	    	  }
	      }
	}
	
}
