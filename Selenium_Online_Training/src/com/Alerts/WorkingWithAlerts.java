package com.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");     	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();
		
		Thread.sleep(3000);
		
		//Switch on to Alert Pop up
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		//TO accept the Pop Up0-------------------
		alert.accept();
		
		
		driver.quit();
	}
	
}
