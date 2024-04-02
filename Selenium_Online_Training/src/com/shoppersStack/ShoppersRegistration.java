package com.shoppersStack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersRegistration {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(10000);

		 boolean isDisplayed = driver.findElement(By.xpath("//h3[contains(text(),\"Welcome to ShoppersStack\")]")).isDisplayed();

		 if (isDisplayed)
		{
			driver.navigate().refresh();
			Thread.sleep(5000);
			WebElement login = driver.findElement(By.xpath("//button[@id='loginBtn']"));
			login.click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span [contains(text(),\"Create Account\")]")).click();
			WebElement createProfile = driver.findElement(By.xpath("//h1 [contains(text(),\"Create Your Profile\")]"));
			if (createProfile.isDisplayed()) {
				driver.findElement(By.id("First Name")).sendKeys("Pavan");
				driver.findElement(By.id("Last Name")).sendKeys("Kumar");
				driver.findElement(By.id("Male")).click();
				driver.findElement(By.id("Phone Number")).sendKeys("9019223534");
				driver.findElement(By.id("Email Address")).sendKeys("pavan.km@testyantra.in");
				driver.findElement(By.id("Password")).sendKeys("Pavan123@");
				driver.findElement(By.id("Confirm Password")).sendKeys("Pavan123@");
				driver.findElement(By.id("Terms and Conditions")).click();
				WebElement register = driver.findElement(By.id("btnDisabled"));

				if (register.isEnabled()) {
					 register.click();
					System.out.println(register);
				}

			}

		}

		driver.quit();
	}

}
