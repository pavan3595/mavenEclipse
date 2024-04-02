package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class To_Launch_AmazonPrime {

	@Test(groups = "ott")
	public void launch() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.primevideo.com/offers/nonprimehomepage/ref=dv_web_force_root");
		Thread.sleep(3000);
		driver.quit();
		
	}
}
