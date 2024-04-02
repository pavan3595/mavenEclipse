package com.ImplicitWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(25));
		driver.get("https://www.shoppersstack.com/");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
		
		driver.findElement(By.id("loginBtn")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//strong[contains(text(),\"Shopper\")]")));
		
		

	}

}
