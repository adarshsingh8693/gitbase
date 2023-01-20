package practice_axesxpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPATHAxes {

	public static void main(String[] args) {
            WebDriver driver = WebDriverManager.chromedriver().create();
            
            driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            
          //SELF
           String text = driver.findElement(By.xpath("//a[contains(text(),'Ind-Swift L')]/self::a")).getText();
           System.out.println(text);
           
           String text1 = driver.findElement(By.xpath("//a[contains(.,'Bharat Immunolog')]/self::a")).getText();
           System.out.println(text1);
         System.out.println("----------------------------------------------------");  
           
           //parent
           String text2 = driver.findElement(By.xpath("//a[contains(text(),'Ind-Swift L')]/parent::td")).getText();
           System.out.println(text2);
           
          String text3 = driver.findElement(By.xpath("//a[contains(text(),'Bharat Immunolog')]/parent::td")).getText();
          System.out.println(text3);
          System.out.println("----------------------------------------------------");  
          //Child
            List<WebElement> text4 = driver.findElements(By.xpath("//a[contains(.,'Ind-Swift L')]/ancestor::tr/child::td"));
          for(int i=0;i<text4.size();i++)
          {
        	  System.out.println(text4.size());
        	  System.out.print(text4.get(i).getText());
          }
          System.out.println("----------------------------------------------------");  
          //ancester
          
         text=driver.findElement(By.xpath("//a[contains(.,'Bharat Immunolog')]/ancestor::tr")).getText();
         System.out.println(text);
         System.out.println("----------------------------------------------------");   
         //descendant
         List<WebElement> ele = driver.findElements(By.xpath("//a[contains(.,'Bharat Immunolog')]/ancestor::tr/descendant::*"));
         for(int i=0;i<ele.size();i++)
         {
       	  
       	  System.out.println(ele.get(i).getText());
         }
         System.out.println("----------------------------------------------------");   
         ele = driver.findElements(By.xpath("//a[contains(.,'Bharat Immunolog')]/ancestor::tr/descendant::td"));
         for(int i=0;i<ele.size();i++)
         {
       	  
       	  System.out.println(ele.get(i).getText());
         }
         System.out.println("----------------------------------------------------");  
         //following-selects everything in the document after the closing tag of the current node
         
         List<WebElement> no = driver.findElements(By.xpath("//a[contains(.,'Bharat Immunolog')]/ancestor::tr/following::tr"));
         System.out.println(no.size());
         System.out.println("----------------------------------------------------"); 
         //following-sibling : select all siblings after the current node
       System.out.println(driver.findElements(By.xpath("//a[contains(.,'Bharat Immunolog')]/ancestor::tr/following-sibling::tr")).size());
         System.out.println("----------------------------------------------------"); 
         
          //preceding : select all node that appear before the current node in the document
         ele=driver.findElements(By.xpath("//a[contains(.,'Bharat Immunolog')]/ancestor::tr/preceding::tr"));
         System.out.println(ele.size());
         System.out.println("----------------------------------------------------");
         
         ele=driver.findElements(By.xpath("//a[contains(.,'Bharat Immunolog')]/ancestor::tr/preceding-sibling::tr"));
         System.out.println(ele.size());
         
         
          
          
	}

}
