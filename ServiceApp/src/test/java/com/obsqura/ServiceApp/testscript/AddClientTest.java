package com.obsqura.ServiceApp.testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.obsqura.ServiceApp.pages.AddClientPage;
import com.obsqura.ServiceApp.pages.LoginPage;

import utilities.ExcelUtility;

public class AddClientTest extends Base
{
	@Test
	public void verifyUserIsAbleToAddClientWithoutClientName()
	{
		String userName = ExcelUtility.getString(1, 0, "LoginPage");
		String passWord = ExcelUtility.getString(1, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(passWord).clickOnLoginButton();
		
		AddClientPage addClientpage = new AddClientPage(driver);
		addClientpage.clickOnClient();
		addClientpage.clickOnAddClient();
		addClientpage.clickOnSubmit();
		//addClientpage.checkForValueRequiredMessage();
		assertTrue(addClientpage.checkForValueRequiredMessage().equals("This value is required."), "User is  able to add client without name");	
		
	}

}
