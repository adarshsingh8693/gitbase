package com.Zoo_View.objectresporatory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  AddAnimalPage {
	
	@FindBy(xpath="//span[.='Animals Details']")
	private WebElement animalDetail;
	
	@FindBy(xpath="//a[.='Add Animals']")
	private WebElement addAnimal;
	
	@FindBy(id="aname")
	private WebElement animalName;
	
	@FindBy(id="image")
	private WebElement animalImage;
	
	@FindBy(id="cnum")
	private WebElement cageNumber;
	
	@FindBy(id="fnum")
	private WebElement feedNumber;
	
	@FindBy(id="breed")
	private WebElement bread;
	
	@FindBy(id="desc")
	private WebElement description;
	
	@FindBy(name="submit")
	private WebElement submit;
	
	public AddAnimalPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public WebElement getAnimalDetail() {
		return animalDetail;
	}


	public WebElement getAddAnimal() {
		return addAnimal;
	}


	public WebElement getAnimalName() {
		return animalName;
	}


	public WebElement getAnimalImage() {
		return animalImage;
	}


	public WebElement getCageNumber() {
		return cageNumber;
	}


	public WebElement getFeedNumber() {
		return feedNumber;
	}


	public WebElement getBread() {
		return bread;
	}


	public WebElement getDescription() {
		return description;
	}


	public WebElement getSubmit() {
		return submit;
	}


	public void logInPage(String anName,String absPath,String cNo,String fNo,String brd,String mssg) {
		animalDetail.click();
		addAnimal.click();
		animalName.sendKeys(anName);
		animalImage.sendKeys(absPath);
		cageNumber.sendKeys(cNo);
		feedNumber.sendKeys(fNo);
		bread.sendKeys(brd);
		description.sendKeys(mssg);
		submit.click();
	}
	

}
