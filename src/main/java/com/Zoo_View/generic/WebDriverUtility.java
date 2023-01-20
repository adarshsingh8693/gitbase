package com.Zoo_View.generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtility {

	/*
	 * 
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void waitForPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
}
	/*
	 * 
	 */
	public void elementToBeVisible(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
/*
 * 
 */
	public void select(WebElement element,String text) {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	/*
	 * 
	 */
	public void select(String value,WebElement element) {
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	/*
	 * 
	 */
	public void select(WebElement element,int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	/*
	 * 
	 */
	public WebDriver launchTheBrowser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		return driver;
	}
	/*
	 * 
	 */
	public void mousehover(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	/*
	 * 
	 */
	public void dragAndDrop(WebDriver driver,WebElement src,WebElement dst) {
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dst).perform();
	}
	/*
	 * 
	 */
	public void doubleClickAction(WebDriver driver,WebElement target) {
		Actions act=new Actions(driver);
		act.doubleClick(target).perform();
		
	}
	/*
	 * 
	 */
	public void rightClick(WebDriver driver,WebElement target) {
		Actions act=new Actions(driver);
		act.contextClick(target).perform();
		
	}
	/*
	 * 
	 */
	public void rightClick(WebDriver driver) {
		Actions act=new Actions(driver);
		act.contextClick().perform();
		
	}
	/*
	 * 
	 */
	public void enterKeyPress(WebDriver driver) {
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();	
	}
	/*
	 * 
	 */
	public void enterKey(WebDriver driver) throws AWTException
	{
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
	}
	/*
	 * 
	 */
	public void enterRelease(WebDriver driver) throws AWTException {
		Robot rb=new Robot();
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
	/*
	 * 
	 */
	public void switchToFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	/*
	 * 
	 */
	public void switchToFrame(WebDriver driver,String nameOrID)
	{
		driver.switchTo().frame(nameOrID);
	}
  	/*
	 * 
	 */
	public void switchToFrame(WebDriver driver,WebElement address) {
		driver.switchTo().frame(address);
	}
	/*
	 * 
	 */
	public String acceptAlert(WebDriver driver) {
		Alert a = driver.switchTo().alert();
		String text=a.getText();
		a.accept();
		return text;
	}
	/*
	 * 
	 */
	public void cancelAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	/*
	 * 
	 */
	public void switchToWinDow(WebDriver driver,String partialTitle) {
		 Set<String> windows = driver.getWindowHandles();
		 
		    Iterator<String> it = windows.iterator();
		    while(it.hasNext()) {
		    	String winId=it.next();
		    	String currentWinTitle=driver.switchTo().window(winId).getTitle();
		    	if(currentWinTitle.contains(partialTitle)) {
		    		break;
		    	}
		    }
				
	}
	/*
	 * 
	 */
	public String getScreenShot(WebDriver driver,String screenshotName) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 String path=".\\screenshot\\"+screenshotName+".png";
		 File dst=new File(path);
		 FileUtils.copyFile(src, dst);
		 return path;
		 
		 
	}
	/*
	 * 
	 */
	public void scrollBarAction(WebDriver driver) {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,800)","");
	}
	/*
	 *    
	 */
	public void scrollAction(WebDriver driver,WebElement element) {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		int y=element.getLocation().getY();
		jse.executeScript("window.scrollBy(0,"+y+")",element);
		jse.executeScript("argument[o].scrollIntoView()",element);
	}
}