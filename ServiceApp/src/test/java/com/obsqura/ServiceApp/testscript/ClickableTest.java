package com.obsqura.ServiceApp.testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.obsqura.ServiceApp.pages.ClickablePage;
import com.obsqura.ServiceApp.pages.LoginPage;

import utilities.ExcelUtility;

public class ClickableTest extends Base
{
	@Test
	public void verifyUserIsAbleToClickOnAddButton()
	{
		String userName = ExcelUtility.getString(1, 0, "LoginPage");
		String passWord = ExcelUtility.getString(1, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(passWord).clickOnLoginButton();
		
		ClickablePage clickablePage = new ClickablePage(driver);
		clickablePage.clickAddButton();
		assertTrue(clickablePage.checkForAddTitle().equals("Add"), "User not able to click on add button");
	}

}
