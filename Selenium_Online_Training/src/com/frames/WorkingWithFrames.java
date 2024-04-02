package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");     	
		Thread.sleep(2000);
		
		
		//Switch to frame using index
		//driver.switchTo().frame(0);
		
		//Switch to frame using id or name
		//driver.switchTo().frame("navbar-iframe");
		
		//Switch to frame Using web Element
		WebElement frame = driver.findElement(By.id("navbar-iframe"));
		driver.switchTo().frame(frame);
		
		
		
		driver.findElement(By.id("b-query")).sendKeys("pavan");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.name("textboxn")).sendKeys("Kolar");
		Thread.sleep(3000);
		driver.quit();
		

	}

}
