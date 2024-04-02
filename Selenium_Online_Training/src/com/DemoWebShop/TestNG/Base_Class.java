package com.DemoWebShop.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base_Class {
	
	WebDriver driver;
	String url;
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite Execution...");
		url = "https://demowebshop.tricentis.com/";
		
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
	
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
		System.out.println("CLose the Browser...");
		
	}
	
	@BeforeMethod
	public void login() throws InterruptedException
	{
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("pavankumarcm2000@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		driver.findElement(By.className("ico-logout")).click();
		Thread.sleep(3000);
		System.out.println("LogOut from DemoWebShop...");
		
	}
}
