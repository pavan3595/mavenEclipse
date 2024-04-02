package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class To_Launch_Benz {
	
	@Test(groups = "car")
	public void launch()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercedes-benz.co.in/");
		driver.quit();
		
	}

}
