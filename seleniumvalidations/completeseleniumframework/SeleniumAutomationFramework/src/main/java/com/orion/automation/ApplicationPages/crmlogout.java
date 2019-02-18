package com.orion.automation.ApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.orion.automation.TestBase.BaseClass;
import com.orion.automation.Utility.Utility;

public class crmlogout extends BaseClass {

	WebDriver driver;

	 public crmlogout(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	

	
	@FindBy(xpath="//a[@href='https://www.freecrm.com/index.cfm?logout=1']") WebElement logout;
	
	
	public void logOutFromcrm() throws InterruptedException
	{
	Thread.sleep(3000);
		Utility.waitForWebElement(driver, logout, 20).click();
		//Logger.log(LogStatus.PASS, "logout from application");
	}
	
}




