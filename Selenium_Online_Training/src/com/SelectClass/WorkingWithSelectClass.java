 package com.SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithSelectClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/books");     	
		Thread.sleep(2000);
		
		
		WebElement element = driver.findElement(By.id("products-pagesize"));
		Select sel = new Select(element);
		
		//Select by index
		//sel.selectByIndex(2);
		
		//Select by Value
		//sel.selectByValue("https://demowebshop.tricentis.com/books?pagesize=4");
		
		//Select by visibleText
		sel.selectByVisibleText("12");
		
		driver.quit();
		

	}

}
