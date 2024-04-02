package com.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	//TO maximize the window
	driver.manage().window().maximize();
	Thread.sleep(3000);
	//To navigate to URL
	driver.get("https://www.selenium.dev/");
	Thread.sleep(3000);
	//TO minimize the Window
	driver.manage().window().minimize();
	Thread.sleep(3000);
	driver.manage().window().maximize();
	//To quit the Browser
	Thread.sleep(3000);
	driver.quit();
	

	}

}
