package com.orion.automation.TestBase;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.orion.automation.Utility.Utility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class BaseClass 
{

	public WebDriver driver;
	public ExtentReports report;
	public ExtentTest Logger;
	
	@BeforeSuite
	public void setupTestSuite()
	{
			System.out.println("********************************************");
			System.out.println("Test Suite Start");
			report=new ExtentReports(System.getProperty("user.dir")+"/Reports/"+Utility.getCurrentDateTime()+".html");
			
	}
	
	@BeforeClass
	public void startTest()
	{
	
		driver=com.orion.automation.Applicationfactory.BrowserFactory.getBrowser(com.orion.automation.Applicationfactory.DataProviderFactory.getConfig().getBrowser(),com.orion.automation.Applicationfactory.DataProviderFactory.getConfig().getTestURL());
	}
	
	
	@AfterClass
	public void endTest()
	{
		driver.quit();
	}
	
	@AfterMethod
	public void endLogger(ITestResult result)
	{
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String path=Utility.captureScreenshot(driver);
			Logger.log(LogStatus.FAIL, Logger.addScreenCapture(path));
			Logger.log(LogStatus.FAIL, "Test Failed because of "+result.getThrowable().getMessage());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			Logger.log(LogStatus.PASS, "Test Completed Successfully");
		}
		else
		{
			Logger.log(LogStatus.SKIP, "Test Skipped "+result.getThrowable().getMessage());
		}
		report.endTest(Logger);	
	}
	
	
	
	@AfterSuite
	public void tearDownTestSuite()
	{
		System.out.println("Test Suite End");
		report.flush();
		System.out.println("********************************************");
	
	}
	
}
