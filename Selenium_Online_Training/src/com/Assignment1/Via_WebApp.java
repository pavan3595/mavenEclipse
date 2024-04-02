package com.Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Via_WebApp {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://in.via.com/");
		Thread.sleep(2000);

		String email = "pavan.km@testyantra.in";
		String password = "Pavan0903@";

//		driver.findElement(By.className("signUpBtn")).click();
//		driver.findElement(By.id("emailIdSignUp")).sendKeys(email");
//		driver.findElement(By.id("passwordSignUp")).sendKeys(password);
//		driver.findElement(By.id("nameSignUp")).sendKeys("Pavan");
//		driver.findElement(By.id("mobileNoSignUp")).sendKeys("9019223534");
//		driver.findElement(By.id("signUpValidate")).click();

		driver.findElement(By.id("loginIdText")).sendKeys(email);
		driver.findElement(By.id("passwordText")).sendKeys(password);
		driver.findElement(By.id("loginValidate")).click();

//		driver.findElement(By.partialLinkText("Via Corp")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.partialLinkText("Via Agent")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.partialLinkText("Download App")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.partialLinkText("Support")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("departure")).click();
		Thread.sleep(3000);

		WebElement date = driver.findElement(By.xpath("//div[@id='depart-cal']//span[text()=' 2024']//span[text()='Mar']/../../..//div[text()='25' and not (contains(@class,'vc-disabled-cell'))]"));
		date.click();
		Thread.sleep(3000);
		driver.quit();
	}

}
