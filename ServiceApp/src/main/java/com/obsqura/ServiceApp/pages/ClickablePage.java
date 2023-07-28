package com.obsqura.ServiceApp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ClickablePage 
{
	public WebDriver driver;
	public ClickablePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@class='dropdown item-more']//parent::a[@class='dropdown-toggle']")private WebElement addButton;
	@FindBy(xpath = "//font[contains(text(),'Add')]")private WebElement addTitle;

	
	public void clickAddButton()
	{
		PageUtility pageUtility = new PageUtility();
		pageUtility.actionClick(addButton, driver);
	}
	public String checkForAddTitle()
	{
		String title = addTitle.getText();
		return title;
	}

}
