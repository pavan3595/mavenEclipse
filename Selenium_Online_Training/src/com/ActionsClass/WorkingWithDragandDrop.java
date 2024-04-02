package com.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDragandDrop {
	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.eviltester.com/styled/drag-drop-javascript.html");
		Thread.sleep(3000);
		
		WebElement dragElement1 = driver.findElement(By.id("draggable1"));
		WebElement dragElement2 = driver.findElement(By.id("draggable2"));
		WebElement dropElement1 = driver.findElement(By.id("droppable1"));
		WebElement dropElement2 = driver.findElement(By.id("droppable2"));
		
		
		Actions action = new Actions(driver);
		
//		action.dragAndDrop(dragElement1, dropElement1).perform();
//		Thread.sleep(3000);
//		action.dragAndDrop(dragElement2, dropElement2).perform();
		
		//action.clickAndHold(dragElement1).dragAndDrop(dropElement1, dropElement1).perform();
		action.clickAndHold(dragElement1).moveToElement(dropElement1).release().perform();
		
		
	}

}
