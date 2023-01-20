package practice_axesxpath;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String wid = driver.getWindowHandle();
		//System.out.println(wid);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Thread.sleep(3000);
	Set<String> w2id = driver.getWindowHandles();
	    java.util.Iterator<String> i = w2id.iterator();
	    /*while(i.hasNext())
	    {
	    	
	    	System.out.println(i.next());
	    }*/
	    String parentid = i.next();
	    String childid=i.next();
		
		System.out.println("parent window id"+parentid);
		System.out.println("child window id"+childid);
		
		//convert set into list
		
		ArrayList al=new ArrayList(w2id);
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		
		//How to use window id for Switch purpose
		
		
		 
		
		
	}

}
