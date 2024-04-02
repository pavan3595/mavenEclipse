package com.WindowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(2000);

		
		driver.findElement(By.partialLinkText("Facebook")).click();
		Thread.sleep(2000);
		
		 String parentWindow = driver.getWindowHandle();
		 System.out.println(parentWindow);
		 
		  Set<String> allWindows = driver.getWindowHandles();
		  System.out.println(allWindows);
		  
		  for (String eachWindow : allWindows) {
			  
			  driver.switchTo().window(eachWindow);
			  System.out.println(driver.getTitle());
			  System.out.println(driver.getCurrentUrl());
			  
			  driver.close();
		}
	}

}
