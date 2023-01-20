  package com.Zoo_View.objectresporatory;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNormalTicketPage {
	
	@FindBy(xpath="//a[.='Manage Ticket']")
	private WebElement manageNorTkt;
	
	@FindBy(xpath="//a[.='View']")
	private List<WebElement> view;
	
	@FindBy(xpath="//tr//td[3]")
	private List<WebElement> vistName;
	
	@FindBy(xpath="(//a[.='Delete'])[1]")
	private WebElement delete;
	
	@FindBy(xpath="//div[@id='exampl']/h5")
	private WebElement detailofTic;
	
	@FindBy(xpath="//div[@id='exampl']/h4")
	private WebElement tickid;
	
	@FindBy(xpath="//tr//child::td")
	private List<WebElement> pricNoOfTic;
	
	@FindBy(xpath="//p//i")
	private WebElement printtkt;
	
	

	public ManageNormalTicketPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}

	public WebElement getManageNorTkt() {
		return manageNorTkt;
	}

	public List<WebElement> getView() {
		return view;
	}

	public List<WebElement> getVistName() {
		return vistName;
	}

	public WebElement getDelete() {
		return delete;
	}

	public WebElement getDetailofTic() {
		return detailofTic;
	}

	public WebElement getTickid() {
		return tickid;
	}

	public List<WebElement> getPricNoOfTic() {
		return pricNoOfTic;
	}

	public void detailofvisitor()
	{
		manageNorTkt.click();
		for(int i=0;i<vistName.size();i++) {
			
			String name = vistName.get(i).getText();
			if(name.equalsIgnoreCase("vicky"))
			{
				for(int j=0;j<view.size();j++) {
				view.get(i).click();
				System.out.println(detailofTic.getText());
				System.out.println(tickid.getSize());
				break;
				}
			}
				
			
					
			}
			
		}
		
	}
	

