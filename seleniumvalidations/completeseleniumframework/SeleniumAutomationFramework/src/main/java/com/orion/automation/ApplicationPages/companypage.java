package com.orion.automation.ApplicationPages;

import org.apache.poi.poifs.crypt.dsig.RevokedCertificateSecurityException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.orion.automation.Applicationfactory.BrowserFactory;
import com.orion.automation.Applicationfactory.DataProviderFactory;
import com.orion.automation.TestBase.BaseClass;
import com.orion.automation.Utility.Utility;

public class companypage extends BaseClass {

	WebDriver driver;

	public companypage(WebDriver ldriver) {

		this.driver = ldriver;
	}

	@FindBy(xpath =("//a[@title='Companies']"))
	WebElement clickoncompany;
	
@FindBy(xpath=("//*[@id=\"navmenu\"]/ul/li[3]/ul/li[2]/a"))
	WebElement combinedform;

@FindBy(xpath=("//input[@name='company_name']"))
	WebElement companyname;

@FindBy(xpath=("//input[@name='first_name']"))
WebElement firstname;
@FindBy(xpath=("//select[@name='category']"))
WebElement catrogy;
@FindBy(xpath=("//input[@name='surname']"))
WebElement lastname;
@FindBy(xpath=("//input[@type='radio' and @value='N' and @name='receive_email']"))
WebElement recieveemail;
@FindBy(xpath=("//img[@id='f_trigger_c_birthday']"))
WebElement selectdate;



		
		public void clickoncombinedform(){
			Actions action = new Actions(driver);
			action.moveToElement(Utility.waitForWebElement(driver, clickoncompany, 20)).build().perform();
			Utility.waitForWebElement(driver, combinedform, 20).click();
			Utility.waitForWebElement(driver, companyname, 20).sendKeys(DataProviderFactory.getExcel().getData("company", 1, 0));
			Utility.waitForWebElement(driver, firstname, 20).sendKeys(DataProviderFactory.getExcel().getData("company", 1, 1));
			Utility.waitForWebElement(driver, lastname, 20).sendKeys(DataProviderFactory.getExcel().getData("company", 1, 2));
				
			BrowserFactory.selectUsingVisibleText(catrogy,"Client");
			Utility.waitForWebElement(driver, recieveemail, 20).click();
			Utility.waitForWebElement(driver, selectdate, 20).click();
			//BrowserFactory.SwitchToAnotherWindow(driver, 2);
			}
			
			
			
			
	
	}


	


