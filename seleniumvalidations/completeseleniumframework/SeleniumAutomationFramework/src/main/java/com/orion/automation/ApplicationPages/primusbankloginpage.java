package com.orion.automation.ApplicationPages;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.orion.automation.Applicationfactory.DataProviderFactory;
import com.orion.automation.TestBase.BaseClass;
import com.orion.automation.Utility.Utility;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Test;







public class primusbankloginpage extends BaseClass




{
	WebDriver driver;

	public primusbankloginpage(WebDriver ldriver) {

		this.driver = ldriver;
	}

	
	

	@FindBy(xpath =("//*[@id='txtuId']"))
	WebElement username;
	
@FindBy(xpath=("//*[@id='txtPword']"))
	WebElement password;

@FindBy(xpath=("//*[@id='login']"))
	WebElement loginButton;



	public void logintoprimusbank() 
	{
		
	 Utility.waitForWebElement(driver, username, 20).sendKeys(DataProviderFactory.getExcel().getData("Login", 1, 0));
	
		//Logger.log(LogStatus.PASS, "enter username");
	Utility.waitForWebElement(driver, password, 20).sendKeys(DataProviderFactory.getExcel().getData("Login", 1, 1));
		//Logger.log(LogStatus.PASS, "enter password");
	Utility.waitForWebElement(driver, loginButton, 20).click();
		//Logger.log(LogStatus.PASS, "click on login");
	}

}