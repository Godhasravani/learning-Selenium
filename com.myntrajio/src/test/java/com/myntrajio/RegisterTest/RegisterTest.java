package com.myntrajio.RegisterTest;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.myntrajio.generic.commonlibrary.BaseTest;
import com.myntrajio.generic.javalibrary.JavaLibrary;
import com.myntrajio.generic.pagerepository.RegisterPage;


@Listeners(com.myntrajio.generic.listenerlibrary.ListenerImplementation.class)

public class RegisterTest extends BaseTest{
	
@Test
public void RegisterValidData ()  {
	
	String name=excellibrary.readData("RegisterDetails", 1, 0);
	String email=excellibrary.readData("RegisterDetails", 1, 1);
	String password=excellibrary.readData("RegisterDetails", 1, 2);
	String mobnum=excellibrary.readData("RegisterDetails", 1, 3);
	String feedback=excellibrary.readData("RegisterDetails", 1, 5);
	
	
//	JavaLibrary.pause(5000);
	
	//provide implicit wait
	webdriverlibrary.waitUntilElementFound();
	
	
	
	String exptitle="LearningSelenium";
	String acttitle=webdriverlibrary.driver.getTitle();
	System.out.println(acttitle);

	//step1:Verify the register page
	Assert.assertEquals(exptitle, acttitle,"Verified Register Page");
	
	
	
    //create an object for register page	
	RegisterPage regpage=new RegisterPage(webdriverlibrary.driver);
	
	boolean elementExpectedCondition=true;
	boolean elementActualCondition=regpage.getNametextfield().isDisplayed();
	

	//step2:verify the element
	Assert.assertEquals(elementExpectedCondition, elementActualCondition,"Verified nametextfield web element--It is displayed ");
	
	
	//step3:perform action --clear
	regpage.getNametextfield().clear();
	
	
	//step4:perform action--enter name
	regpage.getNametextfield().sendKeys(name);
	

	//step4:perform action--Enter email
	regpage.getEmailtextfield().sendKeys(email);
	
	//step5: perform action --enter password
	regpage.getPasswordtextfield().sendKeys(password);
	
	//step6:perform action enter mobile no
	regpage.getMobiletextfield().sendKeys(mobnum);
	
	//step7:perform action on female radio button
	regpage.getfemaleradiobutton().click();
	
	//step8:perform actionon manali check box
	regpage.getbanglorecheckbox().click();
	
	//step9:perform action on enter feedback
	regpage.getfeedbacktextfield().sendKeys(feedback);
	
	
	Reporter.log("Register valid data success",true);
}
}

	