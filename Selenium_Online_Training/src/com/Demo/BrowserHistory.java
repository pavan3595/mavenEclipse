package com.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserHistory {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
//		
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().forward();
//		Thread.sleep(3000);
//		driver.navigate().refresh();
//		Thread.sleep(3000);
//		driver.quit();
		
		driver.navigate().to("https://www.vivo.com/in");
		
		driver.quit();
		
	}

}
