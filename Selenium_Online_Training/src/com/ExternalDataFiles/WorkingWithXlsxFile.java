package com.ExternalDataFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WorkingWithXlsxFile {

	public static void main(String[] args) throws IOException {

		// Create Object for File
		File file = new File("./Test Data/Test.xlsx");

		// Create File Input Stream
		FileInputStream fis = new FileInputStream(file);

		// Create the Workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		String sheetName = workbook.getSheetName(0);

		System.out.println(sheetName);

		XSSFSheet firstSheet = workbook.getSheet(sheetName);
		XSSFCell firstCell = firstSheet.getRow(0).getCell(0);
		
		System.out.println(firstCell);

	}

}
