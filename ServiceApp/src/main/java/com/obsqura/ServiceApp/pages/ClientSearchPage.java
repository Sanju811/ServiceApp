package com.obsqura.ServiceApp.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientSearchPage
{
	public WebDriver driver;
	public ClientSearchPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@type='search']")private WebElement searchField;
	@FindBy(xpath = "//input[@id='identity']")private WebElement userNameField;
	@FindBy(xpath = "//input[@id='password']")private WebElement passWordField;
	@FindBy(xpath ="//input[@value='Login']")private WebElement loginButton;
	@FindBy(xpath = "//h1[contains(text(),'Home')]")private WebElement homePage;
	@FindBy(xpath = "//div[@class='small-box bg-green']//parent::a[@class='small-box-footer']")private WebElement clientMoreInfo;
	@FindBy(xpath ="//td[@class='dataTables_empty']")private WebElement noMatchesFound;
	@FindBy(xpath = "//table[@id='dynamic-table']")private WebElement dataTable;
	@FindBy(xpath = "//table[@id='dynamic-table']//td")private List<WebElement> tableCellData;
	
	
	
	public ClientSearchPage enterUserNameOnUserNameField(String userName)
	{
		userNameField.sendKeys(userName);
		return this;
	}
	public ClientSearchPage enterPasswordOnPasswordField(String password)
	{
		passWordField.sendKeys(password);
		return this;
	}
	public ClientSearchPage clickOnLoginButton()
	{
		loginButton.click();
		return this;
	}
	public void clickOnMoreInfo()
	{
		clientMoreInfo.click();
	}
	public void enterSearchValueOnSearchField(String searchValue)
	{
		searchField.sendKeys(searchValue);
	}
	public void searchFieldClear()
	{
		searchField.clear();
	}
	
	public boolean isNoMatchesFoundDisplayed()
	{
		return noMatchesFound.isDisplayed();
	}
	public int rowSize()
	{
		List <WebElement> rows = dataTable.findElements(By.xpath("//tr[@class]"));
		int rowSize = rows.size();
		return rowSize;
	}
	
	public boolean IsClientExist(String searchValue)
	{
		boolean flag = false;
		for(WebElement column: tableCellData)
		{
			String getCellText = column.getText();
			if(getCellText.equals(searchValue)) {
				flag = true;
				break;
			}
       	}
		
		return flag;
	}

}
