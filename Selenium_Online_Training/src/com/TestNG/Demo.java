package com.TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Demo1.class)
public class Demo {

	public static WebDriver driver;
	
	@Test
	public void login()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://demowebshopc";
		
		
		driver.get("https://demowebshop.tricentis.com/");
		String currentUrl = driver.getCurrentUrl();
		assertEquals(url, currentUrl);
		
		driver.quit();
	}
}


