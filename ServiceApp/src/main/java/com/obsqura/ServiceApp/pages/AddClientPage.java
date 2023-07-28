package com.obsqura.ServiceApp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddClientPage 
{
	public WebDriver driver;
	public AddClientPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='small-box bg-green']//parent::a[@class='small-box-footer']")private WebElement client;
	@FindBy(xpath = "//button[@class='add_c btn btn-primary']")private WebElement addClient;
	@FindBy(xpath = "//button[@id='submit']")private WebElement addClientSubmitButton;
	@FindBy(xpath ="//ul[@id='parsley-id-69']//parent::li[@class='parsley-required']" )private WebElement valueRequired;
	
	public void clickOnClient()
	{
		client.click();
	}
	public void clickOnAddClient()
	{
		addClient.click();
	}
	public void clickOnSubmit()
	{
		addClientSubmitButton.click();
	}
	public String checkForValueRequiredMessage()
	{
		String message = valueRequired.getText();
		return message;
	}

}
