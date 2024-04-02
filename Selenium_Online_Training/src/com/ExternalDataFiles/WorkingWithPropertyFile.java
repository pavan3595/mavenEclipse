package com.ExternalDataFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WorkingWithPropertyFile {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
//		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
//		WebDriver driver = new ChromeDriver(options);
//		driver.manage().window().maximize();
//		driver.get("https://in.via.com/");
//		
		
		//.Create Object for File
		File file = new File("./Test Data/Test.properties");
		
		//Create FileInputSream
		FileInputStream fis = new FileInputStream(file);
		
		//Create Properties Object
		Properties prop = new Properties();
		prop.load(fis);
		
		String url = prop.getProperty("url");
		System.out.println(url);
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println("Navigated to DemoWebShop...");
		Thread.sleep(2000);
		

	}

}
