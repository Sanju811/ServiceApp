package com.obsqura.ServiceApp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public WebDriver driver;
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='identity']")private WebElement userNameField;
	@FindBy(xpath = "//input[@id='password']")private WebElement passWordField;
	@FindBy(xpath ="//input[@value='Login']")private WebElement loginButton;
	@FindBy(xpath = "//h1[contains(text(),'Home')]")private WebElement homePage;
	
	
	public LoginPage enterUserNameOnUserNameField(String userName)
	{
		userNameField.sendKeys(userName);
		return this;
	}
	public LoginPage enterPasswordOnPasswordField(String password)
	{
		passWordField.sendKeys(password);
		return this;
	}
	public LoginPage clickOnLoginButton()
	{
		loginButton.click();
		return this;
	}
	public boolean isHomePageDisplayed()
	{
		return homePage.isDisplayed();
	}
	public boolean isLoginButtonDisplayed()
	{
		return loginButton.isDisplayed();
	}
}