package ApplicationTestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;





public class primusbanklogintestcase extends Testbase.BaseClass{
	@Test
	public void login()
	{
		Logger=report.startTest("Login", "Test pass sucessfully");
		Applicationpages.primusbankloginpage login=PageFactory.initElements(driver, Applicationpages.primusbankloginpage.class);
		
		Applicationpages.primusbanklogoutpage logout=PageFactory.initElements(driver, Applicationpages.primusbanklogoutpage.class);
		
		//Utility.waitforTitle(driver,"primusbank", 30);
		
		login.logintoprimusbank();
		Logger.log(LogStatus.PASS, "browser launch");
		Logger.log(LogStatus.PASS, "application is launched");
		Logger.log(LogStatus.PASS, "entered username");
		Logger.log(LogStatus.PASS, "entered password");
		Logger.log(LogStatus.PASS, "click on login");
		//Utility.waitforURLContains(driver, "dashboard", 30);
		
		logout.logOutFromApplication();
		Logger.log(LogStatus.PASS, "logout from application");
		
		
		
	}
	
	
}


