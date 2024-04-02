package com.RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.puma.com/in/en");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	
		
	String year = "2024";   
	String month="Mar";
	String date = "27";
     driver.findElement(By.xpath("//span[contains(text(),'"+year+"')]//span[contains(text(),'"+month+"')]/../../../div[@class=\"vc-month-box\"]//div[contains(text(),'"+date+"') and not(contains(@class,'vc-disabled-cell'))]"));
		

	}

}
