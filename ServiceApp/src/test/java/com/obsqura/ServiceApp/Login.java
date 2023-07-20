package com.obsqura.ServiceApp;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends Base
{
	@Test
	public void loginToServiceApp()
	{
		String userName = "admin@admin.com";
		WebElement userNameField = driver.findElement(By.xpath("//input[@id='identity']"));
		userNameField.sendKeys(userName);
		String passWord = "password";
		WebElement passWordField = driver.findElement(By.xpath("//input[@id='password']"));
		passWordField.sendKeys(passWord);
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		loginButton.click();
	}
	@Test
	public void verifyUserIsAbleToLoginUsingValidCredenials()
	{
		String userName = "admin@admin.com";
		WebElement userNameField = driver.findElement(By.xpath("//input[@id='identity']"));
		userNameField.sendKeys(userName);
		String passWord = "password";
		WebElement passWordField = driver.findElement(By.xpath("//input[@id='password']"));
		passWordField.sendKeys(passWord);
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		loginButton.click();
		String expectedUrl= driver.getCurrentUrl();
		String actualUrl="https://qalegend.com/mobile_service/panel/welcome";
		assertEquals(actualUrl, expectedUrl,"Login using valid credentials not leads to Home page");
	}
	@Test
	public void verifyUserIsNotAbleToLoginUsingValidUsernameAndInvalidPassword()
	{
		String userName = "admin@admin.com";
		WebElement userNameField = driver.findElement(By.xpath("//input[@id='identity']"));
		userNameField.sendKeys(userName);
		String passWord = "abc";
		WebElement passWordField = driver.findElement(By.xpath("//input[@id='password']"));
		passWordField.sendKeys(passWord);
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		loginButton.click();
		String expectedUrl= driver.getCurrentUrl();
		String actualUrl="https://qalegend.com/mobile_service/panel/login";
		assertEquals(actualUrl, expectedUrl,"Login using valid username and Invalid Password leads to Home page");
		
	}
	@Test
	public void verifyUserIsNotAbleToLoginUsingInvalidUsernameAndValidPassword()
	{
		String userName = "admin";
		WebElement userNameField = driver.findElement(By.xpath("//input[@id='identity']"));
		userNameField.sendKeys(userName);
		String passWord = "password";
		WebElement passWordField = driver.findElement(By.xpath("//input[@id='password']"));
		passWordField.sendKeys(passWord);
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		loginButton.click();
		String expectedUrl= driver.getCurrentUrl();
		String actualUrl="https://qalegend.com/mobile_service/panel/login";
		assertEquals(actualUrl, expectedUrl,"Login using Invalid username and Valid Password leads to Home page");
		
	}
	
	@Test
	public void verifyUserIsNotAbleToLoginUsingInvalidUsernameAndPassword()
	{
		String userName = "admin";
		WebElement userNameField = driver.findElement(By.xpath("//input[@id='identity']"));
		userNameField.sendKeys(userName);
		String passWord = "abc";
		WebElement passWordField = driver.findElement(By.xpath("//input[@id='password']"));
		passWordField.sendKeys(passWord);
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		loginButton.click();
		String expectedUrl= driver.getCurrentUrl();
		String actualUrl="https://qalegend.com/mobile_service/panel/logi";
		assertEquals(actualUrl, expectedUrl,"Login using Invalid username and Password leads to Home page");
		
	}
	

}
