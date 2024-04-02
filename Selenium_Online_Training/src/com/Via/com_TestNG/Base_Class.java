package com.Via.com_TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.dataloader.Try;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base_Class {
	
	
	WebDriver driver;
	String url;
	String email;
	String password;
	
	@BeforeSuite
	public void fetchData() throws IOException
	{
		File file = new File("./Test Data/Test.properties");
		
		FileInputStream fis = new FileInputStream(file);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		url=prop.getProperty("url");
		email=(String) prop.get("email");
		password=(String) prop.get("password");
		
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite Execution...");
	}

	@BeforeTest
	public void browserSetUp() throws Exception
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println("Navigated to DemoWebShop...");
		Thread.sleep(2000);
	}
//	
//	@AfterTest
//	public void closeBrowser()
//	{
//		driver.quit();
//		Reporter.log("Browser Closed..");
//		
//	}
	
	
//	@BeforeMethod
//	public void login() throws InterruptedException
//	{
//		driver.findElement(By.id("loginIdText")).sendKeys(email);
//		driver.findElement(By.id("passwordText")).sendKeys(password);
//		driver.findElement(By.id("loginValidate")).click();
//	}
//	
//	@AfterMethod
//	public void logout() throws InterruptedException
//	{
//		Reporter.log("Logout Successfull....");
//		
//	}
}
