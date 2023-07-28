package com.obsqura.ServiceApp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class DropDownPage 
{
	public WebDriver driver;
	public DropDownPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='small-box bg-aqua']//parent::a[@class='small-box-footer']")private WebElement reparation;
	@FindBy(xpath ="//button[@class='add_reparation btn btn-primary']" )private WebElement addReparation;
	@FindBy(xpath ="//span[@id='select2-warranty-container']" )private WebElement warranty;
	@FindBy(xpath ="//li[text()='1 Month']" )private WebElement firstElement;
	
	public void clickOnReparationMoreInfo()
	{
		reparation.click();
	}	
	public void clickOnAddReparation()
	{
		addReparation.click();
	}
	public void clickOnWarrantyDropdown()
	{
		warranty.click();
		firstElement.click();
	}
	public void SelectValueFromTaxRateDropdown()
	{
		PageUtility pageUtility = new PageUtility();
		//pageUtility.selectDropdownbyText(test1,ExcelUtility.getString(3, 0,"DropDown"));
	}
}
