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
	
//	JavaLibrary.pause(5000);

	//step1:Verify the register page
	Assert.assertEquals("title", "title","Verified Register Page");
	
	//step2:verify the element
	Assert.assertEquals("element", "element","Verified WebElement");
	
    //create an object for register page	
	RegisterPage regpage=new RegisterPage(webdriverlibrary.driver);
	
	//step3:perform action --clear
	regpage.getNametextfield().clear();
	
	
	//step4:perform action--enter name
	regpage.getNametextfield().sendKeys("sravani");
	

	//step4:perform action--enter email
	regpage.getEmailtextfield().sendKeys("abc@1234");
	
	//step5: perform action --enter password
	regpage.getPasswordtextfield().sendKeys("12345ascfaf");
	
	//step6:perform action enter mobile no
	regpage.getMobiletextfield().sendKeys("9965413258");
	
	//step7:perform action on female radio button
	regpage.getfemaleradiobutton().click();
	
	//step8:perform actionon manali check box
	regpage.getbanglorecheckbox().click();
	
	//step9:perform action on enter feedback
	regpage.getfeedbacktextfield().sendKeys("i am in selenium class now");
	
	
	Reporter.log("Register valid data success",true);
}
}

	