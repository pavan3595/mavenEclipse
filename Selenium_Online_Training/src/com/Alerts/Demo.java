package com.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");     	
		Thread.sleep(2000);
		
		driver.findElement(By.id("b-query")).sendKeys("pavan");
		driver.findElement(By.id("b-query-icon")).click();
		
		
		
	}

}
