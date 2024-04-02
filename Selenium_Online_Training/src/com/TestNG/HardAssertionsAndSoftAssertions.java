package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertionsAndSoftAssertions {
	
	@Test
	public void launchAndLogin() throws InterruptedException
	{
		String expectedTitle = "Demo Web";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String title = driver.getTitle();
		
		SoftAssert sf = new SoftAssert();
		
		//Assert.assertEquals(expectedTitle,title);
		
		sf.assertEquals(title,expectedTitle,"Title not matching..");
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
	
		driver.findElement(By.id("Email")).sendKeys("pavankumarcm2000@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys("123456789");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
		Thread.sleep(3000);
		
		driver.quit();
		
		sf.assertAll();
		
	}

}
