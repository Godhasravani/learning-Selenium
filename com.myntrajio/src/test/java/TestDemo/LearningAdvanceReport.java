package TestDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LearningAdvanceReport {

	public static void main(String[] args) {
		// Create object for sparkreport
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReports/report.html");

		// configure the spark Report info
		spark.config().setDocumentTitle("Regression Testion for the Registerpage");
		spark.config().setReportName("Regression Suite");
		spark.config().setTheme(Theme.DARK);

		// create the extentreport
		ExtentReports report = new ExtentReports();

		// Attach the spark report and extent report
		report.attachReporter(spark);

		// conigure the sys information in extent report
		report.setSystemInfo("DeviceName:", "Sravani");
		report.setSystemInfo("OS:", "Windows 10 Pro");
		report.setSystemInfo("Browser:", "Chrome");
		report.setSystemInfo("Version:", "128.0.6613.85 ");

		// create the test information
		ExtentTest test = report.createTest("RegressionTest");

		// steps information
		test.log(Status.INFO, "Step1:Launching the browser successfull");

		test.log(Status.INFO, "Step2:Navigating to applicatioin via url sucessfull");

		test.log(Status.PASS, "Step3:verified the web page sucessfull");

		if (true == true) {
			test.log(Status.PASS, "Step4:Verifying  the web element is displayed Sucessfull ");
		} else {
			test.log(Status.FAIL, "Step5:Element is not displayed sucessfully");
			//test.addScreenCaptureFromBase64String(null,"Screenshot taken--element not displayed");
		}
		test.log(Status.SKIP, "Step6:Element is hidden");

		// flush the report information
		report.flush();

		System.out.println("Execution done sucessfully");
	}

}
