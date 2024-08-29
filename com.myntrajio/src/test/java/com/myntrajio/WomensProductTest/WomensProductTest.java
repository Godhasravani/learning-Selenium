package com.myntrajio.WomensProductTest;


import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(com.myntrajio.generic.listenerlibrary.ListenerImplementation.class)

public class WomensProductTest {

	@Test(groups= {"FT","RT"})
	public void addwomensproduct() {
		Reporter.log(" Mens product added suscess",true);
	}
	@Test(groups= {"IT","RT"})
	public void removewomensproduct() {
		Reporter.log(" womens product removed suscess",true);
	}
	@Test(groups= {"ST","RT"})
	public void updatewomensproduct() {
		Reporter.log("womens product updated suscess",true);
	} 
	
	
	
	
	
}


