package com.obsqura.ServiceApp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class StylePropertyPage 
{
	public WebDriver driver;
	public StylePropertyPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='small-box bg-aqua']//parent::a[@class='small-box-footer']")private WebElement reparation;
	@FindBy(xpath = "//button[@class='add_reparation btn btn-primary']")private WebElement addReparationButton;

	public void clickOnReparation()
	{
		reparation.click();
	}
	public String checkBackGroundColour()
	{
		PageUtility pageUtility = new PageUtility();
		String backGroundColour = pageUtility.stylePropertyValidation(addReparationButton, "background-color");
		return backGroundColour;
		
	}
	public String checkFontColour()
	{
		PageUtility pageUtility = new PageUtility();
		String fontColour = pageUtility.stylePropertyValidation(addReparationButton, "color");
		return fontColour;
		
	}
	public String checkFontWeight()
	{
		PageUtility pageUtility = new PageUtility();
		String fontWeight = pageUtility.stylePropertyValidation(addReparationButton, "font-weight");
		return fontWeight;
		
	}
	
	
}
