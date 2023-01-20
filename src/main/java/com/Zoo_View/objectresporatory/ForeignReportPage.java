package com.Zoo_View.objectresporatory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForeignReportPage {
	@FindBy(xpath="//span[.='Reports']")
	private WebElement reports;
	
	@FindBy(linkText = "Foreigner People Report")
	private WebElement frngp;
	
	@FindBy(id="fromdate")
	private WebElement frmdt;
	
	@FindBy(id="todate")
	private WebElement todt;
	
	@FindBy(xpath="//button[.='Submit']")
	private WebElement submit;
	
	public  ForeignReportPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	
	public WebElement getReports() {
		return reports;
	}


	public WebElement getFrngp() {
		return frngp;
	}


	public WebElement getFrmdt() {
		return frmdt;
	}


	public WebElement getTodt() {
		return todt;
	}


	public WebElement getSubmit() {
		return submit;
	}


	public void enterDate() {
		reports.click();
		frngp.click();
		frmdt.click();
		
	}
	public void todate() throws AWTException
	{
		todt.click();
		Robot r=new Robot();
		 r.delay(300);
	       r.keyPress(KeyEvent.VK_1);
	      // r.delay(2000);
	       r.keyPress(KeyEvent.VK_2);
	      r.delay(200);
	       r.keyPress(KeyEvent.VK_2);
	       r.delay(200);
	       r.keyPress(KeyEvent.VK_7);
	      r.delay(200);
	       r.keyPress(KeyEvent.VK_2);
	       r.keyPress(KeyEvent.VK_0);
	       r.keyPress(KeyEvent.VK_2);
	       r.delay(1000);
	       r.keyPress(KeyEvent.VK_2);
		submit.click();
	}
	

}
