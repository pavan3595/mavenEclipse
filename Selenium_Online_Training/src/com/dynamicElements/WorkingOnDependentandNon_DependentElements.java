package com.dynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnDependentandNon_DependentElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");     	
		Thread.sleep(2000);
		
		
		driver.findElement(By.partialLinkText("BOOKS")).click();
		Thread.sleep(3000);
		
		// WebElement actualPrice = driver.findElement(By.xpath("(//a[text()='Computing and Internet'])[1]/../..//div[@class='prices']/span[@class=\"price actual-price\"]"));
		
		//Creating Variable
		double price = 10;
		
		//Making the Element Dynamic...By setting the variable to the element
		WebElement actualPrice = driver.findElement(By.xpath("(//a[text()='Computing and Internet'])[1]/../..//div[@class='prices']/span[contains(text(),'"+price+"')]"));
		System.out.println(actualPrice.getText());
		
		 
	
	}

}
