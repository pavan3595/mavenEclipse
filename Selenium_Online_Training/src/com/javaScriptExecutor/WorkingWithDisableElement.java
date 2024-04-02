package com.javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDisableElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/index.php");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		WebElement element = driver.findElement(By.xpath("//input[@class='form-control']"));

		jse.executeScript("arguments[0].value='Pavan Kumar'",element);
		Thread.sleep(3000);
	}

}
