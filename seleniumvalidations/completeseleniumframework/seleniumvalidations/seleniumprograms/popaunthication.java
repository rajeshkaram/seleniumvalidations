package mavenproject;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class popaunthication {

WebDriver driver;
	
	@Test
	
	public void brokenlinks() throws MalformedURLException, IOException  {

		System.setProperty("webdriver.chrome.driver", "E:\\completerajesh\\automation\\chromedriver.exe");	
		driver = new ChromeDriver(); 
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	String message=	driver.findElement(By.cssSelector("p")).getText();
	System.out.println(message);
		
		
}
}