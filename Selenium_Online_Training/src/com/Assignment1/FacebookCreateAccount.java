package com.Assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCreateAccount {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com");
		// Thread.sleep(35000);
		driver.findElement(By.partialLinkText("Create new account")).click();

		Thread.sleep(3000);

		driver.findElement(By.name("firstname")).sendKeys("Pavan");
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		driver.findElement(By.name("reg_email__")).sendKeys("pavancm2000@gmail.com");
		
	}

}
