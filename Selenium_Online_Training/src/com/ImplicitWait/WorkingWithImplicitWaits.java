package com.ImplicitWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithImplicitWaits {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(25));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
		WebElement element = driver.findElement(By.xpath("//a[text()='Flipkart']"));
		
		//wait.until(ExpectedConditions.elementToBeClickable(element));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Flipkart']")));
		
		element.click();
	
		driver.quit();
		
		

	}

}
