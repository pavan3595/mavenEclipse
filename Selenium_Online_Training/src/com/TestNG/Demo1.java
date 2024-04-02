package com.TestNG;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class Demo1 implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + " test case start..");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + "Test case pass...");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + "Test case is Fail...");
	
		LocalTime localTime = LocalTime.now();
		TakesScreenshot screenshot = (TakesScreenshot) Demo.driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./SeleniumScreenshots/Screen.png");
		try {
			Files.copy(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("ScreenShotCapture...");
		Demo.driver.quit();

	}

}
