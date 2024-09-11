package com.myntrajio.generic.commonlibrary;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.reporter.configuration.Theme;

//import com.myntrajio.generic.webdriverlibrary.WebDriverLibrary;

public class BaseTest extends ObjectLibrary {

	@BeforeSuite
	public void getSuiteConnections() {
		Reporter.log("Get SuiteConnections Done Sucessful", true);
	}

	@BeforeTest
	public void precondition() {
		
		//create object for all library
		createObject();
		
		//configure the spark report information
		spark.config().setDocumentTitle("Regression testing for the register page");
		spark.config().setReportName("Regression Suite");
		spark.config().setTheme(Theme.DARK);
		
		
		//attach the spark report and extent repork
		report.attachReporter(spark);
		
		//configure the system information in extent report
		report.setSystemInfo("device Name:","Sravani");
		report.setSystemInfo("Os:","Windows 10");
		report.setSystemInfo("Browser name:","Chrome");
		report.setSystemInfo("Browser Version:","chrome-128.0.6613.121");

		
		Reporter.log("Precondition Done Sucessful", true);
		
		
	}
	
	
	@Parameters("browser")//from suite file it will execute
	@BeforeClass
	public void browserSetup(String bname) {
		//create the test report
		test=report.createTest("RegisterTest");
		

		// Create Object For All Library
	//	createObject();

		// Step 1:Launch the Browser
		webdriverlibrary.launchBrowser(bname);

		// Fetch UrlData property-File
		String URL = propertyfilelibrary.readData("url");

		// maximize the browser 
		webdriverlibrary.maximizeBrowser();

		// Step2:Navigate to the Application via URL
		webdriverlibrary.navigateToApp(URL);

		Reporter.log("BrowserSetup:"+bname + "Sucessful", true);
	}

	@BeforeMethod
	public void login() {
		Reporter.log("login Sucessful", true);
	}

	@AfterMethod
	public void Logout() {
		Reporter.log("Logout Sucessful", true);

	}

	@AfterClass
	public void closebrowser() {
		// Close The Browsers
		webdriverlibrary.quitAllWindows();

		Reporter.log("Closebrowser Sucessful", true);
	}

	@AfterTest
	public void postcondition() {
		//Flush the report information
		report.flush();
		Reporter.log("postcondition Done Sucessful", true);
	}

	@AfterSuite
	public void terminateSuiteconnection() {
		Reporter.log("Terminate Suiteconnection Done Sucessful", true);

	}

}