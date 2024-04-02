package com.Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
	public static void main(String[] args) throws InterruptedException {
	
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String title = driver.getTitle();
		if(title.equals("Demo Web Shop"))
		{
			driver.findElement(By.id("pollanswers-1")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("vote-poll-1")).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Log in")).click();
			Thread.sleep(3000);
			
			if(driver.findElement(By.className("page-title")).isDisplayed())
			{
				driver.findElement(By.id("Email")).sendKeys("pavankumarcm2000@gmail.com");
				Thread.sleep(3000);
				driver.findElement(By.id("Password")).sendKeys("123456789");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
				Thread.sleep(3000);
				driver.findElement(By.partialLinkText("pavankumar")).isDisplayed();
				Thread.sleep(3000);
				driver.findElement(By.className("ico-logout")).click();
				Thread.sleep(3000);

				
			}
			
			
		}
		driver.quit();
		
	}

}
