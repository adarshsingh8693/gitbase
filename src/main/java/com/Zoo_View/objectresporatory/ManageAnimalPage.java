package com.Zoo_View.objectresporatory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageAnimalPage {
	
	@FindBy(xpath="//a[.='Manage Animals']")
	private WebElement manageAnimal;
	
	@FindBy(xpath="(//tr[@data-expanded='true'])[1]/descendant::td/child::a[@class='btn btn-primary btn-xs']")
	private WebElement edit;
	
	@FindBy(id="aname")
	private WebElement animalNameEdt; 
	
	@FindBy(name="submit")
	private WebElement submit;
	
	public ManageAnimalPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getManageAnimal() {
		return manageAnimal;
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getAnimalNameEdt() {
		return animalNameEdt;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	public void editAnimalDetl(String name)
	{
		manageAnimal.click();
		edit.click();
		animalNameEdt.sendKeys(name);
		submit.click();
		
	}

}
