package com.ActionsClass;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithActionClass {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);

		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
	
		action.moveToElement(element).perform();
		element = driver.findElement(By.xpath("(//a[contains(text(),'Notebooks')])[1]"));
		action.click(element).perform();
		Thread.sleep(3000);

		driver.quit();
	}
}
