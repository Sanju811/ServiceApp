package com.obsqura.ServiceApp.testscript;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.obsqura.ServiceApp.pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base
{
	@Test
	public void verifyUserIsAbleToLoginUsingValidCredenials()
	{
		String userName = ExcelUtility.getString(1, 0, "LoginPage");//"admin@admin.com";
		String passWord = ExcelUtility.getString(1, 1, "LoginPage");//"password";
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(passWord).clickOnLoginButton();
		boolean isHomePageDisplayed = loginPage.isHomePageDisplayed();
		assertTrue(isHomePageDisplayed,"Login using valid username and Password  not leads to Home page");
	}
	@Test
	public void verifyUserIsNotAbleToLoginUsingValidUsernameAndInvalidPassword()
	{
		String userName = ExcelUtility.getString(1, 0, "LoginPage");
		String passWord = ExcelUtility.getString(2, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(passWord).clickOnLoginButton();
		boolean isLoginButtonPresentInPage = loginPage.isLoginButtonDisplayed();
		assertTrue(isLoginButtonPresentInPage,"Login using valid username and Invalid Password leads to Home page");
		
	}
	@Test
	public void verifyUserIsNotAbleToLoginUsingInvalidUsernameAndValidPassword()
	{
		String userName = ExcelUtility.getString(2, 0, "LoginPage");
		String passWord = ExcelUtility.getString(1, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameOnUserNameField(userName);
		loginPage.enterPasswordOnPasswordField(passWord);
		loginPage.clickOnLoginButton();
		boolean isLoginButtonPresentInPage = loginPage.isLoginButtonDisplayed();
		assertTrue(isLoginButtonPresentInPage,"Login using invalid username and valid Password leads to Home page");
		
	}
	
	@Test
	public void verifyUserIsNotAbleToLoginUsingInvalidUsernameAndPassword()
	{
		String userName = ExcelUtility.getString(2, 0, "LoginPage");
		String passWord = ExcelUtility.getString(2, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameOnUserNameField(userName);
		loginPage.enterPasswordOnPasswordField(passWord);
		loginPage.clickOnLoginButton();
		boolean isLoginButtonPresentInPage = loginPage.isLoginButtonDisplayed();
		assertTrue(isLoginButtonPresentInPage,"Login using invalid username and Password leads to Home page");
			
	}
	

}
