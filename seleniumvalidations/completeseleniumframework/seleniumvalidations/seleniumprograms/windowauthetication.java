package mavenproject;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class windowauthetication {
	WebDriver driver;

@Test
	
	public void brokenlinks() throws MalformedURLException, IOException  {

		File pathToBinary = new File("C:\\Users\\rajesh.k\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		System.setProperty("webdriver.gecko.driver","C:\\Users\\rajesh.k\\Downloads\\geckodriver.exe");       
		
		WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
		
		
		driver.manage().window().maximize();
		Runtime.getRuntime().exec("C:\\Users\\rajesh.k\\Desktop\\window.exe");
		driver.get("http://www.engprod-charter.net/");
}
}
