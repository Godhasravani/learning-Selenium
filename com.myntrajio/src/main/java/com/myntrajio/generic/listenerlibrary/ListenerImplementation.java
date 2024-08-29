package com.myntrajio.generic.listenerlibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.myntrajio.generic.commonlibrary.BaseTest;

public class ListenerImplementation extends BaseTest implements ITestListener {
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		Reporter.log("Taking screenshot started" + name, true);

		//perform typecasting webdrivertype-takescreenshot
		TakesScreenshot tsref = (TakesScreenshot) webdriverlibrary.static_driver;

		//call the screenshot method and save it in temp path
		File temp = tsref.getScreenshotAs(OutputType.FILE);

		//create a permanent path and save
		File permanent = new File("./src/test/resources/Screenshot/" + name + ".png");

		//copy the file from temp to permanent

		try {
			FileHandler.copy(temp, permanent);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Reporter.log("Taking screenshot completed" + name, true);

	}














//	@Override
public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub

}

//	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	}
//
//	@Override
	public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	}

//	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

}

//	@Override
	public void onStart(ITestContext context) {

}

//	@Override
	public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	}
	}
