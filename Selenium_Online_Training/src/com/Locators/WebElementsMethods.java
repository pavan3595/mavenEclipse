package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(3000);
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("Pavan");
		// To get Tag name
		System.out.println(firstName.getTagName());
		// To get Attribute value
		System.out.println(firstName.getAttribute("value"));
		// To get CSS property/value
		System.out.println(firstName.getCssValue("color"));

		// To get location of Element
		Point loc = firstName.getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getX());
		


		// To check element is Displayed or not
		System.out.println(firstName.isDisplayed());
		// To check element is Enabled
		System.out.println(firstName.isEnabled());
		// To check element is Selected
		System.out.println(firstName.isSelected());

	}

}
