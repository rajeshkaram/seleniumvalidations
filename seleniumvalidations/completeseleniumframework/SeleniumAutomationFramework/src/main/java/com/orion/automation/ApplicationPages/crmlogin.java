package com.orion.automation.ApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.orion.automation.Applicationfactory.DataProviderFactory;
import com.orion.automation.TestBase.BaseClass;
import com.orion.automation.Utility.Utility;

public class crmlogin extends BaseClass {

	


	WebDriver driver;

	public crmlogin(WebDriver ldriver) {

		this.driver = ldriver;
	}

	@FindBy(xpath =("//input[@type='text']"))
	WebElement username;
	
@FindBy(xpath=("//input[@type='password']"))
	WebElement password;

@FindBy(xpath=("//input[@type='submit']"))
	WebElement loginButton;



	public void crmlogin() 
	{
		
	 Utility.waitForWebElement(driver, username, 20).sendKeys(DataProviderFactory.getExcel().getData("crmlogin", 1, 0));
	
		//Logger.log(LogStatus.PASS, "enter username");
	Utility.waitForWebElement(driver, password, 20).sendKeys(DataProviderFactory.getExcel().getData("crmlogin", 1, 1));
		//Logger.log(LogStatus.PASS, "enter password");
	Utility.waitForWebElement(driver, loginButton, 20).click();
		//Logger.log(LogStatus.PASS, "click on login");
	}

}
	
