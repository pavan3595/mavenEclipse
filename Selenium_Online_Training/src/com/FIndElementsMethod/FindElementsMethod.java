package com.FIndElementsMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		List<WebElement> list = driver.findElements(By.xpath("//input[@type='radio']"));
		
		
		for(int i=0;i<list.size();i++)
		{
			list.get(i).click();
		}

		for (WebElement element : list) {
			element.click();
			Thread.sleep(3000);
		}
		
		driver.quit();

	}
}
