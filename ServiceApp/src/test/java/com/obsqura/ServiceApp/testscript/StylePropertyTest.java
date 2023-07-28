package com.obsqura.ServiceApp.testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.obsqura.ServiceApp.pages.LoginPage;
import com.obsqura.ServiceApp.pages.StylePropertyPage;

import utilities.ExcelUtility;

public class StylePropertyTest extends Base
{
	@Test
	public void verifyStyleOfAddReparationButtonIsAsperRequirement()
	{
		String userName = ExcelUtility.getString(1, 0, "LoginPage");
		String passWord = ExcelUtility.getString(1, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(passWord).clickOnLoginButton();
		
		StylePropertyPage stylePropertyPage = new StylePropertyPage(driver);
		stylePropertyPage.clickOnReparation();
		stylePropertyPage.checkBackGroundColour();
		stylePropertyPage.checkFontColour();
		stylePropertyPage.checkFontWeight();
		
		assertTrue(stylePropertyPage.checkBackGroundColour().equals("rgba(60, 141, 188, 1)"), "Background colour is not as per requirement");
		assertTrue(stylePropertyPage.checkFontColour().equals("rgba(255, 255, 255, 1)"), "Font colour is not as per requirement");
		assertTrue(stylePropertyPage.checkFontWeight().equals("400"), "Font weight is not as per requirement");		
	}

}
