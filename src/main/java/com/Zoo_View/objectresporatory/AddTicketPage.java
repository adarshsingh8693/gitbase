package com.Zoo_View.objectresporatory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTicketPage {
	
	@FindBy(xpath="//span[.='Normal Ticket']")
	private WebElement normalticket;
	
	@FindBy(xpath="(//a[.='Add Ticket'])[1]")
	private WebElement addTicket;
	
	@FindBy(id="visitorname")
	private WebElement visitorname;
	
	@FindBy(id="noadult")
	private WebElement noOfAdult;
	
	@FindBy(id="nochildren")
	private WebElement noOfChild ;
	
	@FindBy(name="submit")
	private WebElement submit;
	
	public AddTicketPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	

	public WebElement getNormalticket() {
		return normalticket;
	}


	public WebElement getAddTicket() {
		return addTicket;
	}


	public WebElement getVisitorname() {
		return visitorname;
	}


	public WebElement getNoOfAdult() {
		return noOfAdult;
	}


	public WebElement getNoOfChild() {
		return noOfChild;
	}


	public WebElement getSubmit() {
		return submit;
	}


	public void addNorTicKDetail(String vName,String i,String j) {
		normalticket.click();
		addTicket.click();
		visitorname.sendKeys(vName);
		noOfAdult.sendKeys(i);
		noOfChild.sendKeys(j);
		submit.click();
		
	}
}
