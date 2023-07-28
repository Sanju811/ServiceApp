package com.obsqura.ServiceApp.testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.obsqura.ServiceApp.pages.LoginPage;
import com.obsqura.ServiceApp.pages.MenuSelectionPage;

import utilities.ExcelUtility;

public class MenuSelectionTest extends Base
{
	@Test
	public void verifyUserAbleToSelectReparationMenu()
	{
		String userName = ExcelUtility.getString(1, 0, "LoginPage");
		String passWord = ExcelUtility.getString(1, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(passWord).clickOnLoginButton();
		
		MenuSelectionPage menuSelectionPage = new MenuSelectionPage(driver);
		menuSelectionPage.clickOnReparation();
		//menuSelectionPage.isReparationMenuSelected();
		assertTrue(menuSelectionPage.isReparationMenuSelected(), "User not able to select Reparation menu");
	}
	@Test
	public void verifyUserAbleToSelectClientMenu()
	{
		String userName = ExcelUtility.getString(1, 0, "LoginPage");
		String passWord = ExcelUtility.getString(1, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(passWord).clickOnLoginButton();
		
		MenuSelectionPage menuSelectionPage = new MenuSelectionPage(driver);
		menuSelectionPage.clickOnClient();
		
		assertTrue(menuSelectionPage.isClientMenuSelected(), "User not able to select client menu");

	}
	@Test
	public void verifyUserAbleToSelectInventoryProductMenu()
	{
		String userName = ExcelUtility.getString(1, 0, "LoginPage");
		String passWord = ExcelUtility.getString(1, 1, "LoginPage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(passWord).clickOnLoginButton();
		
		MenuSelectionPage menuSelectionPage = new MenuSelectionPage(driver);
		menuSelectionPage.clickOnInventoryProduct();
		
		assertTrue(menuSelectionPage.isInventoryProductMenuSelected(), "User not able to select inventoryproducts menu");

	}
		
}
