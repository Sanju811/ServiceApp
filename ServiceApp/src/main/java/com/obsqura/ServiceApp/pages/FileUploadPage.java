package com.obsqura.ServiceApp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.WaitUtility;

public class FileUploadPage
{
	public WebDriver driver;
	public FileUploadPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//button[@class='add_reparation btn btn-primary']" )private WebElement addReparation;
	@FindBy(xpath ="//button[@id='upload_modal_btn']" )private WebElement uploadPicture;
	@FindBy(xpath ="//input[@id='upload_manager']")private WebElement browse;
	@FindBy(xpath ="//span[text()='Upload']")private WebElement upload;
	@FindBy(xpath = "//div[@class='progress-bar bg-success progress-bar-success']")private WebElement done;
	
	public void clickOnAddReparation()
	{
		addReparation.click();
	}
	public void clickOnUploadPicture()
	{
		uploadPicture.click();
	}
	public void clickOnBrowse()
	{
		browse.click();
	}
	public void selectFile()
	{
		FileUploadUtility fileUploadUtility = new FileUploadUtility();
		fileUploadUtility.fileUploadUsingSendKeys(browse, System.getProperty("user.dir")+"\\src\\main\\java\\resources\\Dress.jpg");
	}
	public void clickOnUpload()
	{
		upload.click();
		
		WaitUtility waitUtility = new WaitUtility();
		waitUtility.waitForElementClickable(driver, upload);
	}
	public String successMessage()
	{
		String message = done.getText();
		return message;
	}
	
	
	

}