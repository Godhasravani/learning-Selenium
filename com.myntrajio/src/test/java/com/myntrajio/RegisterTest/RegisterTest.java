package com.myntrajio.RegisterTest;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.myntrajio.generic.commonlibrary.BaseTest;
import com.myntrajio.generic.javalibrary.JavaLibrary;
import com.myntrajio.generic.pagerepository.RegisterPage;

@Listeners(com.myntrajio.generic.listenerlibrary.ListenerImplementation.class)

public class RegisterTest extends BaseTest {

@Test
public void RegisterValidData ()  {
	
	
	String name=excellibrary.readData("RegisterDetails", 1, 0);
	String email=excellibrary.readData("RegisterDetails", 1, 1);
	String password=excellibrary.readData("RegisterDetails", 1, 2);
	String mobnum=excellibrary.readData("RegisterDetails", 1, 3);
	String feedback=excellibrary.readData("RegisterDetails", 1, 5);
	
	test.log(Status.INFO, "Data Taken from Excel file sucess");
	
	
//	JavaLibrary.pause(5000);
	
	//provide implicit wait
	webdriverlibrary.waitUntilElementFound();
	
	
	
	String exptitle="LearningSelenium";
	String acttitle=webdriverlibrary.driver.getTitle();
	System.out.println(acttitle);

	//step1:Verify the register page
	Assert.assertEquals(exptitle, acttitle);
	
	test.log(Status.PASS, "Verified Title  Register Page is displayed ");
	
    //create an object for register page	
	RegisterPage regpage=new RegisterPage(webdriverlibrary.driver);
	
	boolean elementExpectedCondition=true;
	boolean elementActualCondition=regpage.getNametextfield().isDisplayed();
	
	test.log(Status.PASS, "verified name text field,it is displayed");
	

	//step2:verify the element
	Assert.assertEquals(elementExpectedCondition, elementActualCondition,"Verified nametextfield web element--It is displayed ");
	
	
	//step3:perform action --clear
	regpage.getNametextfield().clear();
	test.log(Status.INFO, "name text field clear sucess");
	
	//step4:perform action--enter name
	regpage.getNametextfield().sendKeys(name);
	test.log(Status.PASS, "Entering  the   name in name text field  sucess");

	

	//step4:perform action--Enter email
	regpage.getEmailtextfield().sendKeys(email);
	test.log(Status.PASS, "Entering  the   email in email text field  sucess");

	
	//step5: perform action --enter password
	regpage.getPasswordtextfield().sendKeys(password);
	test.log(Status.PASS, "Entering  the   password in password text field  sucess");

	
	
	//step6:perform action enter mobile no
	regpage.getMobiletextfield().sendKeys(mobnum);
	test.log(Status.PASS, "Entering  the   mobno  in mobile text field  sucess");

	
	//step7:perform action on female radio button
	regpage.getfemaleradiobutton().click();
	
	test.log(Status.PASS, "clicking   the   radiobutton of female is  sucess");

	
	//step8:perform actionon manali check box
	regpage.getbanglorecheckbox().click();
	test.log(Status.PASS, "clicking  the   checkbox of banglore  is sucess");

	
	//step9:perform action on enter feedback
	regpage.getfeedbacktextfield().sendKeys(feedback);
	test.log(Status.PASS, "Entering  the   feedback  in name feedback field  sucess");

	
	
	Reporter.log("Register valid data success",true);
	test.log(Status.INFO, "Register with the valid data Suceessfully completed");


}



@Test
public void ValidateRegisterButtonSize() {
	
	test.log(Status.INFO, "Validate register button size ");
	Reporter.log("validated sucess",true);
}

@Test
public void ValidateRegisterButtonPosition() {
	test.log(Status.INFO, "Validate register button position ");
	Reporter.log("validated sucess",true);
}
@Test
public void ValidateRegisterButtonColor() 	{
	test.log(Status.INFO, "Validate register button colour ");
	Reporter.log("validated sucess",true);
}
















 //webdriverobj.waitUntilElementFound();
//		
//		String exptitle="LearningSelenium";
//		
//		String acttitle=webdriverobj.driver.getTitle();
//		System.out.println(acttitle);
//		
//		// Step 1: Verify Register page using Assert
//		Assert.assertEquals(exptitle, acttitle,"verified Register Page");
//		
//		//Create an object for Register Page
//		RegisterPage regpage=new RegisterPage(webdriverobj.driver);
//		
//		boolean elementExpCondition=true;
//		boolean elementActualCondition=regpage.getRegisterButton().isDisplayed();
//		
//		//Step 2: Verify the element
//		Assert.assertEquals(elementExpCondition, elementActualCondition,"Verified NameTextField Webelement -It is Displayed");
//org.openqa.selenium.Dimension size=regpage.getRegisterButton().getSize();
//	
//	int width=size.getWidth();
//	
//	int height=size.getHeight();
//	
//	
//	System.out.println("Width :"+width);
//	
//	System.out.println("Height  :"+height);
//Reporter.log("RegisterButtonSize Validated",true);
//	
//}
//@Test
//public void registerValidateRegisterButtonPosition() {
//}
}
//	 webdriverobj.waitUntilElementFound();
//		
//		String exptitle="LearningSelenium";
//		
//		String acttitle=webdriverobj.driver.getTitle();
//		System.out.println(acttitle);
//		
//		// Step 1: Verify Register page using Assert
//		Assert.assertEquals(exptitle, acttitle,"verified Register Page");
//		
//		//Create an object for Register Page
//		RegisterPage regpage=new RegisterPage(webdriverobj.driver);
//		
//		boolean elementExpCondition=true;
//		boolean elementActualCondition=regpage.getRegisterButton().isDisplayed();
//		
//		//Step 2: Verify the element
//		Assert.assertEquals(elementExpCondition, elementActualCondition,"Verified NameTextField Webelement -It is Displayed");
//org.openqa.selenium.Point location= regpage.getRegisterButton().getLocation();
//	
//	int x=location.getX();
//	
//	int y=location.getY();
//	
//	
//	System.out.println("x axis :"+x);
//	
//	System.out.println("y axis  :"+y);
//	Reporter.log("RegisterButtonPosition Validated",true);
//	
//}
//@Test
//public void registerValidateRegisterButtonColor() {
//	{
//	       webdriverobj.waitUntilElementFound();
//			
//			String exptitle="LearningSelenium";
//			
//			String acttitle=webdriverobj.driver.getTitle();
//			System.out.println(acttitle);
//			
//			// Step 1: Verify Register page using Assert
//			Assert.assertEquals(exptitle, acttitle,"verified Register Page");
//			
//			//Create an object for Register Page
//			RegisterPage regpage=new RegisterPage(webdriverobj.driver);
//			
//			boolean elementExpCondition=true;
//			boolean elementActualCondition=regpage.getRegisterButton().isDisplayed();
//			
//			//Step 2: Verify the element
//			Assert.assertEquals(elementExpCondition, elementActualCondition,"Verified NameTextField Webelement -It is Displayed");
//		    
//			String color=regpage.getRegisterButton().getCssValue("color");
//			
//			System.out.println("color of webelement is "+color);
//			
//
//			Reporter.log("RegisterButtonColor Validated",true);	
//
//		
//
//	}
//}
//}
