package com.myntrajio.generic.excellibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.myntrajio.generic.commonlibrary.FrameworkConstant;

public class ReadExcelFile implements FrameworkConstant {

	public FileInputStream fis = null;
	public FileOutputStream fos = null;
	public Workbook wb = null;

	public void readData(String sheet, int row, int column) {
		// step1:convert physical file to java readable object by using file inputstream
		// class

		try {
			fis = new FileInputStream("./src/test/resources/data/testdata.xlxs");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// workbookby creating workbook factory

		try {
			wb = WorkbookFactory.create(fis);

		} catch (IOException e) {
			e.printStackTrace();
		}

		// step3:fetch the data
		String data = wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();

		// step4:close the workbook
		try {
			wb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// step5:print the data
		System.out.println(data);
	}

	public void writeData() {

		// Step 1: Convert physical file to java readable object By using
		// FileInputStream Class
		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Step 2: Open the workbook BY Creating WB-Factory
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Fetch The Data
		String data = wb.getSheet("Register").getRow(4).getCell(1).getStringCellValue();
		System.out.println(data);
		 //To Write the Data
		//String data= wb.getSheet("Register").createRow(4).createCell(1).setCellValue("Potter");
		//System.out.println(data);


		// convert data From Java type to Physical File
		try {
			fos = new FileOutputStream(excelpath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Write the Excel
		try {
			wb.write(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Close the workbook
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Exceution Completed");

	}

	public void displayData(String sheet, int column, int row) {

		// Step 1: Convert physical file to java readable object By using
		// FileInputStream Class
		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Step 2: Open the workbook BY Creating WB-Factory
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Step3:Fetch the Data---->Optimized Code
		String data = wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();

		//step4 print on console
		System.out.println(data);

		// Step5:Close the workbook
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void readMultipleData(String sheet, int column) {

		// Step 1: Convert physical file to java readable object By using
		// FileInputStream Class
		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Step 2: Open the workbook BY Creating WB-Factory
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// How To Fetch Multiple Data

		// Fetch The Last Row Count
		int count = wb.getSheet("Register").getLastRowNum();

		// Fetch data of one Students Details --->
		for (int i = 0; i < 5; i++) {
			String data = wb.getSheet(sheet).getRow(i).getCell(column).getStringCellValue();
			System.out.println(data);
		}

		// Close the workbook
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
