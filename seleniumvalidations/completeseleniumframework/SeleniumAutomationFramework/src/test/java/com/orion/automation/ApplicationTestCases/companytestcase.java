package com.orion.automation.ApplicationTestCases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert.*;
import org.testng.annotations.Test;

import com.orion.automation.ApplicationPages.companypage;
import com.orion.automation.Applicationfactory.BrowserFactory;
import com.orion.automation.Helper.Helper;
import com.orion.automation.TestBase.BaseClass;
import com.relevantcodes.extentreports.LogStatus;

public class companytestcase extends BaseClass {

	@Test
	public void company() throws InterruptedException
	{
		Logger=report.startTest("company", "Test pass sucessfully");
		com.orion.automation.ApplicationPages.companypage company=PageFactory.initElements(driver, com.orion.automation.ApplicationPages.companypage.class);
		
		com.orion.automation.ApplicationPages.crmlogin login=PageFactory.initElements(driver,com.orion.automation.ApplicationPages.crmlogin.class);
		
		login.crmlogin();
		BrowserFactory.frame(1);
		company.clickoncombinedform();
		
		verifytext();
		
		}
		public void verifytext() {
			if(driver.getPageSource().contains("Home")) 
				
				System.out.println("Text is present ");
			else
				System.out.println("Text is not present ");	
			}
		}
	
	
	



