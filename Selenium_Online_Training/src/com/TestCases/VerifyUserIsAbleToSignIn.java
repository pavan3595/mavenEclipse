package com.TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VerifyUserIsAbleToSignIn {

	public static void main(String[] args) throws IOException {

		File file = new File("./Test Data/Test.xlsx");

		FileInputStream fis = new FileInputStream(file);

		Workbook workbook = WorkbookFactory.create(fis);

		String sheetName = workbook.getSheetName(0);

		Sheet firstSheet = workbook.getSheet(sheetName);
		String url = firstSheet.getRow(1).getCell(0).getStringCellValue();
		String email = firstSheet.getRow(1).getCell(1).getStringCellValue();
		String password = firstSheet.getRow(1).getCell(2).getStringCellValue();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(url);

		String title = driver.getTitle();

		if (title.contains("Book Flights, Hotels")) {
			System.out.println("Successfully Navigated...");
		} else {
			System.out.println("Not Navigated...");
		}

		driver.findElement(By.id("loginIdText")).sendKeys(email);
		driver.findElement(By.id("passwordText")).sendKeys(password);
		driver.findElement(By.id("loginValidate")).click();
		
	
		driver.quit();
	}

}
