package mavenproject;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class firefox {

	
	@Test
	
	public void ex() {
		File pathToBinary = new File("C:\\Users\\rajesh.k\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		System.setProperty("webdriver.gecko.driver","C:\\Users\\rajesh.k\\Downloads\\geckodriver.exe");       
		
		WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
		
		driver.get("https://github.com/mozilla/geckodriver/releases");
	}
	
	
}
