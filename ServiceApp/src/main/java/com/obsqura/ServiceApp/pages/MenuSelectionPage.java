package com.obsqura.ServiceApp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuSelectionPage 
{
	public WebDriver driver;
	public MenuSelectionPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='small-box bg-aqua']//parent::a[@class='small-box-footer']")private WebElement reparation;
	@FindBy(xpath = "//div[@class='small-box bg-green']//parent::a[@class='small-box-footer']")private WebElement client;
	@FindBy(xpath = "//div[@class='small-box bg-yellow']//parent::a[@class='small-box-footer']")private WebElement inventoryProduct;
	@FindBy(xpath = "//h1[contains(text(),'Reparations')]")private WebElement reparationPage;
	@FindBy(xpath = "//h1[contains(text(),'Customers')]")private WebElement clientPage;
	@FindBy(xpath = "//h1[contains(text(),'Inventory')]")private WebElement inventoryProductsPage;


	public void clickOnReparation()
	{
		reparation.click();
	}
	public void clickOnClient()
	{
		client.click();
	}
	public void clickOnInventoryProduct()
	{
		inventoryProduct.click();
	}
	public boolean isReparationMenuSelected()
	{
		boolean isReparationPageDisplayed = reparationPage.isDisplayed();
		return isReparationPageDisplayed;
	}
	public boolean isClientMenuSelected()
	{
		boolean isClientPageDisplayed = clientPage.isDisplayed();
		return isClientPageDisplayed;
	}
	public boolean isInventoryProductMenuSelected()
	{
		boolean isInventoryProductsPageDisplayed = inventoryProductsPage.isDisplayed();
		return isInventoryProductsPageDisplayed;
	}
	
}
