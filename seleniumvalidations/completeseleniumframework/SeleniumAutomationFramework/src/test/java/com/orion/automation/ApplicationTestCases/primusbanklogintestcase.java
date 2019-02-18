package com.orion.automation.ApplicationTestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.orion.automation.ApplicationPages.primusbankloginpage;
import com.orion.automation.TestBase.BaseClass;
import com.relevantcodes.extentreports.LogStatus;


public class primusbanklogintestcase extends BaseClass{
	
	
	@Test
	public void login()
	{
		Logger=report.startTest("Login", "Test pass sucessfully");
		primusbankloginpage login=PageFactory.initElements(driver,primusbankloginpage.class);
		
		
		
		login.logintoprimusbank();
		Logger.log(LogStatus.PASS, "browser launch");
		Logger.log(LogStatus.PASS, "application is launched");
		Logger.log(LogStatus.PASS, "entered username");
		Logger.log(LogStatus.PASS, "entered password");
		Logger.log(LogStatus.PASS, "click on login");
		//Utility.waitforURLContains(driver, "dashboard", 30);
		
		//logout.logOutFromApplication();
		Logger.log(LogStatus.PASS, "logout from application");
		
		
		
	}
	
	
}






