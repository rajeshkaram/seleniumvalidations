
package mavenproject;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class elementpresent {
WebDriver driver;
@Test
	
	public void brokenlinks() throws MalformedURLException, IOException  {

		System.setProperty("webdriver.chrome.driver", "E:\\completerajesh\\automation\\chromedriver.exe");	
		driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		
		if(driver.findElement(By.xpath("//*[@id=\"u_0_11\"]"))!= null) {
			
			System.out.println("Element is Present");
		}else{
		System.out.println("Element is Absent");
		}
			
		}



	

}
