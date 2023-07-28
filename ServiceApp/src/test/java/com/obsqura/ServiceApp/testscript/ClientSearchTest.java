package com.obsqura.ServiceApp.testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import com.obsqura.ServiceApp.pages.ClientSearchPage;
import utilities.ExcelUtility;

public class ClientSearchTest extends Base
{
	@Test
	public void verifyUserableToFindExistingClients()
	{
			String userName = ExcelUtility.getString(1, 0, "LoginPage");
			String passWord = ExcelUtility.getString(1, 1, "LoginPage");
			String searchvalue = ExcelUtility.getString(0, 1, "SearchClient");

			ClientSearchPage clientSearchPage = new ClientSearchPage(driver);
			clientSearchPage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(passWord).clickOnLoginButton();
			clientSearchPage.clickOnMoreInfo();
			clientSearchPage.enterSearchValueOnSearchField(searchvalue);
			int rowSize = clientSearchPage.rowSize();
		    assertTrue(clientSearchPage.IsClientExist(searchvalue), "User not able to find existing client");	
		
	}
	@Test
	public void verifySearchForNonExistingClientShowsMatchesNotFound()
	{
		String userName = ExcelUtility.getString(1, 0, "LoginPage");
		String passWord = ExcelUtility.getString(1, 1, "LoginPage");
		String searchvalue = ExcelUtility.getString(0, 0, "SearchClient");
		
		ClientSearchPage clientSearchPage = new ClientSearchPage(driver);
		clientSearchPage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(passWord).clickOnLoginButton();
		clientSearchPage.clickOnMoreInfo();
		clientSearchPage.enterSearchValueOnSearchField(searchvalue);
		int rowSize = clientSearchPage.rowSize();
		boolean isNoRecordFound = clientSearchPage.isNoMatchesFoundDisplayed();
		assertTrue(isNoRecordFound ,"Search for NonExistingclient shows matches");
	}
}
