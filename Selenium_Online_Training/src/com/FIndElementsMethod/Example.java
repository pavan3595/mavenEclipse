package com.FIndElementsMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		//List<WebElement> a = driver.findElements(By.tagName("a"));
		List<WebElement> a = driver.findElements(By.xpath("//input[contains(@type,\"checkbox\")]"));
		
		for(int i=0; i<a.size(); i++) {
			//String text = a.get(i).getText();
			a.get(i).click();
			Thread.sleep(2000);
			//System.out.println(i+1+"." + text);
			System.out.println();
		}
		
		driver.quit();
	}

}
