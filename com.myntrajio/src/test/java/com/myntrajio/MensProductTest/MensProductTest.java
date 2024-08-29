package com.myntrajio.MensProductTest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(com.myntrajio.generic.listenerlibrary.ListenerImplementation.class)

public class MensProductTest {

	@Test
	public void  menprodct() {
		Reporter.log("Mens product added success");
		
	}
	@Test(groups= {"FT","RT"})
	public void addmensproduct() {
		Reporter.log(" Mens product added suscess",true);
	}
	@Test(groups= {"IT","RT"})
	public void removemensproduct() {
		Reporter.log(" Mens product removed suscess",true);
	}
	@Test(groups= {"ST","RT"})
	public void updatemensproduct() {
		Reporter.log(" Mens product updated suscess",true);
	} 
	
	
	
	
	
}


