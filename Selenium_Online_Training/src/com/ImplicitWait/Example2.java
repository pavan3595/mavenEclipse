package com.ImplicitWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example2 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(25));
		driver.get("https://www.w3schools.com/w3css/tryit.asp?filename=tryw3css_progressbar_labels_js4");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[contains(text(),\"Upload Photos\")]")).click();
		
		//driver.findElement(By.xpath("//p[contains(text(),\"Successfully uploaded\")]"));
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("myP"),"Successfully uploaded"));
		
		String text = driver.findElement(By.id("myP")).getText();
		System.out.println(text);
		
		
		
	}

}
