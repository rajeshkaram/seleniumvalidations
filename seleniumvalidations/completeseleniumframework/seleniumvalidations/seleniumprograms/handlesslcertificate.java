
package mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class handlesslcertificate {
	
	

	@Test
	public void handlecerificate(){
	
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
	System.setProperty("webdriver.chrome.driver", "E:\\completerajesh\\automation\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(cap);
	
	driver.get("https://www.cacert.org/");

}
	}
