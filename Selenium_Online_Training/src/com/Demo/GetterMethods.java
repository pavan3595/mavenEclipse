package com.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetterMethods {

	public static void main(String[] args) {
		
		String expectedUrl = "https://www.redbus.in/";

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		//TO get the CurrentURL
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//TO get the PageTitle
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		//Validation of URL
		if(url.equals(expectedUrl))
		{
			System.out.println("Passed : Successfully Navigated..." );
		}
		else
		{
			System.out.println("Failed : Not Successfully Navigated..." );
		}

	}

}
