package com.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class To_Launch_Shoppersstack {

	@Test(groups = "ecom")
	public void launch() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(25));
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Welcome to ShoppersStack')]")));
		driver.quit();
		
	}
	
}
