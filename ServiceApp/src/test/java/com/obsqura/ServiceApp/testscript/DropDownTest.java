package com.obsqura.ServiceApp.testscript;

import org.testng.annotations.Test;

import com.obsqura.ServiceApp.pages.DropDownPage;
import com.obsqura.ServiceApp.pages.LoginPage;

import utilities.ExcelUtility;


public class DropDownTest extends Base
{
	@Test
	public void verifyUserAbleToSelectFromDropDown()
	{
		String userName = ExcelUtility.getString(1, 0, "LoginPage");
		String passWord = ExcelUtility.getString(1, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(passWord).clickOnLoginButton();
		
		DropDownPage dropDownPage = new DropDownPage(driver);
		dropDownPage.clickOnReparationMoreInfo();
		dropDownPage.clickOnAddReparation();
		dropDownPage.clickOnWarrantyDropdown();
		//dropDownPage.SelectValueFromTaxRateDropdown();
		
		
	}
	
}
