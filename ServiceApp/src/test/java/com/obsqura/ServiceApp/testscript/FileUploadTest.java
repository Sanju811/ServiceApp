package com.obsqura.ServiceApp.testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.obsqura.ServiceApp.pages.FileUploadPage;
import com.obsqura.ServiceApp.pages.LoginPage;
import com.obsqura.ServiceApp.pages.MenuSelectionPage;

import utilities.ExcelUtility;

public class FileUploadTest extends Base
{
	@Test
	public void verifyUserIsAbleToUploadFile()
	{
		String userName = ExcelUtility.getString(1, 0, "LoginPage");
		String passWord = ExcelUtility.getString(1, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(passWord).clickOnLoginButton();
		
		MenuSelectionPage menuSelectionPage = new MenuSelectionPage(driver);
		menuSelectionPage.clickOnReparation();
		
		FileUploadPage fileUploadPage = new FileUploadPage(driver);
		fileUploadPage.clickOnAddReparation();
		fileUploadPage.clickOnUploadPicture();
		fileUploadPage.selectFile();
		fileUploadPage.clickOnUpload();
	
		assertTrue(fileUploadPage.successMessage().equals("Done"), "User is not able to upload File");
		
	}

}
