  package practice_Selenium_Code;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		a.moveByOffset(30,30).click().perform();
		driver.findElement(By.xpath("//ul[@class='makeFlex font12']//li[@data-cy='menu_Buses']")).click();
		driver.findElement(By.xpath("//label[@for='fromCity']//input[@id='fromCity']")).click();
		
		//sendKeys("Bengaluru");
		List<WebElement> sel = driver.findElements(By.xpath("//ul[@role='listbox']/li/div/p/span"));
		for(int i=0;i<sel.size();i++) {
			 if(sel.get(i).getText().equalsIgnoreCase("Bangalore, Karnataka"))
			 {
				 sel.get(i).click();
				 break;
			 }
		 }
		driver.findElement(By.xpath("//div[@role='combobox']//input[@type='text']")).sendKeys("Kavoor");
		
			Thread.sleep(2000);
		
		 sel = driver.findElements(By.xpath("//ul[@role='listbox']/li/div/p/span"));
		for(int i=0;i<sel.size();i++) {
			 if(sel.get(i).getText().equalsIgnoreCase("Kavoor, Karnataka"))
			 {
				 sel.get(i).click();
				 break;
			 }


		 }
		 Date d=new Date();
		 System.out.println(d);
		 String []dt=d.toString().split(" ");
		 String day=dt[0];
		 String month=dt[1];
		 String date=dt[2];
		 String year=dt[5];
		 String traveldate="Sat Mar 04 2023";
		 for(;;) {
			 try {
				 Thread.sleep(200);
			 driver.findElement(By.xpath("//div[@aria-label='"+traveldate+"']")).click();
			 break;
			 
		 }
			 catch(Exception e) {
				 Thread.sleep(300);
				 driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				 
			 }
			 }
	
		driver.findElement(By.id("search_button")).click();
		driver.findElement(By.xpath("//img[@class='primoCloseIcon']")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='bus-card']/descendant::div/child::span[@class='latoBlack font22 blackText appendRight15']   ")));
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='bus-card']/descendant::div/child::span[@class='latoBlack font22 blackText appendRight15']"));
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		/*WebElement from = driver.findElement(By.xpath("//div[@class='fsw ']//div//div//label[@for='fromCity']//input [@id='fromCity']"));
	//	from.click();Bangalore, Karnataka
		from.sendKeys("Bengaluru");
		 List<WebElement> sel = driver.findElements(By.xpath("//ul[@role='listbox']/li/div/div/p[1]"));
		 for(int i=0;i<sel.size();i++) {
			 if(sel.get(i).getText().equalsIgnoreCase("Bengaluru, India"))
			 {
				 sel.get(i).click();
				 break;
			 }
		 }
		 WebElement to = driver.findElement(By.xpath("//label[@for='toCity']//input[@id='toCity']"));
		 to.sendKeys("New Delhi");
		 sel=driver.findElements(By.xpath("//ul[@role='listbox']/li/div/div/p[1]"));
		 for(int i=0;i<sel.size();i++) {
			 if(sel.get(i).getText().equalsIgnoreCase("New Delhi, India"))
			 {
				 sel.get(i).click();
				 break;
			 }
		 }
		 Date d=new Date();
		 System.out.println(d);
		 String []dt=d.toString().split(" ");
		 String day=dt[0];
		 String month=dt[1];
		 String date=dt[2];
		 String year=dt[5];
		 String traveldate="Thu Mar 09 2023";
		// traveldate=day+" "+month+" "+date+" "+year;
		 for(;;) {
			 try {
				// Thread.sleep(100);
			 driver.findElement(By.xpath("//div[@aria-label='"+traveldate+"']")).click();
			 break;
			 
		 }
			 catch(Exception e) {
				 //Thread.sleep(100);
				 driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				 
			 }
			 }
	
		driver.findElement(By.xpath("//a[.='Search']")).click();
		driver.findElement(By.xpath("//div[@class='commonOverlay ']//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
		/*driver.findElement(By.xpath("//img[@class='primoCloseIcon']")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='bus-card']/descendant::div/child::span[@class='latoBlack font22 blackText appendRight15']   ")));
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='bus-card']/descendant::div/child::span[@class='latoBlack font22 blackText appendRight15']"));
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}*/
		
		 
	}

}
