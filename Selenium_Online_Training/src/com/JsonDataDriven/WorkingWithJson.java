package com.JsonDataDriven;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Iterator;

import org.apache.commons.collections4.functors.InstanceofPredicate;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.bytebuddy.utility.dispatcher.JavaDispatcher.Instance;

public class WorkingWithJson {

	public static void main(String[] args) throws IOException, ParseException {
		
		
		JSONParser json = new JSONParser();
		FileReader reader = new FileReader("./Test Data/Test.json");
		Object jsp = json.parse(reader);
		
		JSONObject jsonObject = (JSONObject) jsp;
		String url = (String) jsonObject.get("url");
		//String email = (String) jsonObject.get("Email");
		String password = (String) jsonObject.get("Password");
		
		

//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
//		WebDriver driver = new ChromeDriver(options);
//		driver.manage().window().maximize();
//		driver.get(url);
		
		String email;
		String st =  (String) jsonObject.get("Email");
		System.out.println(jsonObject);
		System.out.println(st);
		
		
//		for(int i=0;i<;i++)
//		{
//			
//		   email = (String) jsonObject.
//		   driver.findElement(By.id("loginIdText")).sendKeys(email);
//		}
		
		//driver.findElement(By.id("passwordText")).sendKeys(password);
		//driver.findElement(By.id("loginValidate")).click();
		

	}

}
