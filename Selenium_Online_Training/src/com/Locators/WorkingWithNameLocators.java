package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNameLocators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(3000);
		driver.findElement(By.name("Gender")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("FirstName")).sendKeys("Pavan");
		Thread.sleep(3000);
		driver.findElement(By.name("LastName")).sendKeys("Kumar");
		Thread.sleep(3000);
		
		driver.quit();

	}

}
