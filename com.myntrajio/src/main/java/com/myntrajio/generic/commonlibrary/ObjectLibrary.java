package com.myntrajio.generic.commonlibrary;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.myntrajio.generic.excellibrary.ReadExcelFile;
import com.myntrajio.generic.javalibrary.JavaLibrary;
import com.myntrajio.generic.propertyfilelibrary.ReadPropertyFileLibrary;
import com.myntrajio.generic.webdriverlibrary.WebDriverLibrary;

public class ObjectLibrary implements FrameworkConstant {

public ReadExcelFile excellibrary;
public JavaLibrary javalibrary;
public ReadPropertyFileLibrary propertyfilelibrary;
public  WebDriverLibrary webdriverlibrary;
public ExtentSparkReporter spark;
public ExtentReports report;
public ExtentTest test;

	public void createObject() {
		excellibrary = new ReadExcelFile();
	    javalibrary=new JavaLibrary();
	    propertyfilelibrary = new ReadPropertyFileLibrary();
		webdriverlibrary = new WebDriverLibrary();
	
	//create the spark report
		spark=new ExtentSparkReporter(reportpath);
		
		//create the extent report
		report=new ExtentReports();
	
	
	}









}



