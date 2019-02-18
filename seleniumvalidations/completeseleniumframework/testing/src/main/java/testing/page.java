package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class page extends testcase {
	
 //WebDriver driver;

public page(WebDriver driver){

    this.driver = driver;

    //This initElements method will create all WebElements
    
	
    PageFactory.initElements(driver, this);

}   

	@FindBy(xpath =("//*[@id='txtuId']"))
	WebElement username;
	
    @FindBy(xpath=("//*[@id='txtPword']"))
	WebElement password;

    @FindBy(xpath=("//*[@id='login']"))
	WebElement loginButton;





	public void setusername(String userid)
	{
		
		
	 Utility.waitForWebElement(driver, username, 20).sendKeys(userid);
	}
	
	public void setpassword(String passid) {
		
		
	 Utility.waitForWebElement(driver, password, 20).sendKeys(passid);
	}
	
	public void sub() {
		
		
		
	 Utility.waitForWebElement(driver, loginButton, 20).click();
	}
	
	
	public  void verifylogin(String userid,String passid) {
		
		setusername(userid);
		setpassword(passid);
		sub();
	
		
	}
	
}

