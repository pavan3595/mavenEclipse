package com.dynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTraversing {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		WebElement element = driver.findElement(By.xpath("//table[@id=\"table1\"]//td[text()=\"Manish\"]/.."));
		System.out.println(element.getText());
	
		WebElement element1 = driver.findElement(By.xpath("//table[@id='table1']//td[text()='Manish']/following-sibling::td[1]"));

		System.out.println(element1.getText());
		
		
		
	}

}
