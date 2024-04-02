package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");     	
		Thread.sleep(2000);
		
//		driver.findElement(By.linkText("Log in")).click();
//		Thread.sleep(3000);
//		//Xpath by attributes
//		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("pavancm2000@gmail.com");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456789");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@value='Log in']")).click();
//		Thread.sleep(3000);
		
		//Xpath by contains using text()
		WebElement text = driver.findElement(By.xpath("//p[contains(text(),'Feel free to shop')]"));
		System.out.println(text);
		Thread.sleep(2000);
		
		//Xpath by contains using Attribute
		driver.findElement(By.xpath("//img[contains(@alt,\"Tricentis Demo Web Shop\")]"));
		
		 
	
		
		driver.quit();
		
	}

}
