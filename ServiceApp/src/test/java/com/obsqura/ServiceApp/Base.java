package com.obsqura.ServiceApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	public WebDriver driver;
	@BeforeMethod
	public void initialiseBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\git\\Automationcourse\\Automationcourse\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://qalegend.com/mobile_service");
	}
	@AfterMethod
	public void browserQuit()
	{
		driver.quit();
	}

}
