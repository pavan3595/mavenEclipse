package com.TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider {

	@DataProvider(name="logData")
	public String[][] fetchData() throws IOException {

		// Create Object for File
		File file = new File("./Test Data/Test.xlsx");

		// Create File Input Stream
		FileInputStream fis = new FileInputStream(file);

		// Create the Workbook
		Workbook workbook = WorkbookFactory.create(fis);

		int rows = workbook.getSheet("Login").getPhysicalNumberOfRows();
		int cols = workbook.getSheet("Login").getRow(0).getPhysicalNumberOfCells();
		System.out.println(rows);
		System.out.println(cols);

		String data[][] = new String[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				data[i][j] = workbook.getSheet("Login").getRow(i).getCell(j).toString();
			}
		}

		return data;

	}

	@Test(dataProvider = "logData")
	public void login(String [] logData) {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://in.via.com/");

		driver.findElement(By.id("loginIdText")).sendKeys(logData[0]);
		driver.findElement(By.id("passwordText")).sendKeys(logData[1]);
		driver.findElement(By.id("loginValidate")).click();
		
		driver.quit();

	}

}
