package com.TesingAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SystemTesting1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("pavankumarcm2000@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys("123456789");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.partialLinkText("BOOKS")).click();
		Thread.sleep(3000);

		WebElement orderBy = driver.findElement(By.id("products-orderby"));
		Select orderByOption = new Select(orderBy);
		orderByOption.selectByIndex(1);
		Thread.sleep(2000);

		WebElement pageSize = driver.findElement(By.id("products-pagesize"));
		Select pageSizeOption = new Select(pageSize);
		pageSizeOption.selectByIndex(1);
		Thread.sleep(2000);

		WebElement viewMode = driver.findElement(By.id("products-viewmode"));
		Select viewModeOption = new Select(viewMode);
		viewModeOption.selectByIndex(0);
		Thread.sleep(2000);

		String actualPrice = driver
				.findElement(By.xpath("(//div[@class=\"item-box\"])[1]//span[@class=\"price actual-price\"]"))
				.getText();
		System.out.println("Actual Price :" + actualPrice);

		WebElement addToCart = driver.findElement(
				By.xpath("(//div[@class=\"item-box\"])[1]//div[@class=\"buttons\"]//input[@type='button']"));
		if (addToCart.isDisplayed()) {
			addToCart.click();
			Thread.sleep(5000);
		}

		driver.findElement(By.className("ico-cart")).click();

		WebElement qtyInput = driver.findElement(By.className("qty-input"));
		qtyInput.clear();
		qtyInput.sendKeys("2");
		qtyInput.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		String subTotal = driver.findElement(By.xpath("//span[@class=\"product-subtotal\"]")).getText();

		System.out.println("SubTotal : " + subTotal);

		driver.findElement(By.id("termsofservice")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);

	}

}
