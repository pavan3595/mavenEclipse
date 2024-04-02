package com.shoppersStack;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersLogin {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email....");
		String email = sc.next();
		
		System.out.println("Enter Password....");
		String password = sc.next();
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(10000);

		boolean isDisplayed = driver.findElement(By.xpath("//h3[contains(text(),\"Welcome to ShoppersStack\")]"))
				.isDisplayed();

		if (isDisplayed) {
			driver.navigate().refresh();
			Thread.sleep(5000);
			WebElement login = driver.findElement(By.xpath("//button[@id='loginBtn']"));
			login.click();
			Thread.sleep(5000);

			isDisplayed = driver.findElement(By.xpath("//strong[contains(text(),\"Shopper\")]")).isDisplayed();
			if (isDisplayed) {
				driver.findElement(By.id("Email")).sendKeys(email);
				driver.findElement(By.id("Password")).sendKeys(password);
				driver.findElement(By.id("Login")).click();

			}

		}

		driver.quit();
	}

}
