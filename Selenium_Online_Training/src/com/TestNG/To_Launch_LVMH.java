package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class To_Launch_LVMH {
	
	@Test(groups = "ecom")
	public void launch()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lvmh.com/");
		driver.quit();
		
	}

}
