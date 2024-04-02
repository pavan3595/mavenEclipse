package com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VerifyUserIsAbleToSignUp {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://in.via.com/");
		String title=driver.getTitle();
		
		if(title.contains("Book Flights, Hotels"))
		{
			System.out.println("Successfully Navigated...");
		}
		else
		{
			System.out.println("Not Navigated...");
		}
		
		String email = "pavan.km@testyantra.in";
		String password = "Pavan0903@";
		
		driver.findElement(By.className("signUpBtn")).click();
		driver.findElement(By.id("emailIdSignUp")).sendKeys(email);
		driver.findElement(By.id("passwordSignUp")).sendKeys(password);
		driver.findElement(By.id("nameSignUp")).sendKeys("Pavan");
		driver.findElement(By.id("mobileNoSignUp")).sendKeys("9019223534");
		driver.findElement(By.id("signUpValidate")).click();
		

	}

}
