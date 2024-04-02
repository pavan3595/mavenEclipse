package com.ActionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkintWithKeyBoardActions {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");     	
		Thread.sleep(2000);
		
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.SPACE).perform();
		action.sendKeys(Keys.PAGE_DOWN).perform();
		action.sendKeys(Keys.PAGE_UP).perform();
		action.sendKeys(Keys.END).perform();
	
		driver.quit();
		
		
		
		
	}

}
