package mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class datep {

	
	WebDriver driver;
	String month="March 2021";
	String date="21";
	@Test
	public void datepicker() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\completerajesh\\automation\\chromedriver.exe");	
	driver = new ChromeDriver(); 
	
	driver.get("http://www.phptravels.net/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@type='text' and @placeholder='Check in' and @class='form input-lg dpd1' ]")).click();
	WebElement mon=driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]//div[1]//thead//tr[1]//th[2]"));
	while(true) {
		
		if(mon.getText().equals(month)) {
			break;
			
		}
		
		else {
			
			driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]//div[1]//thead//tr[1]//th[3]")).click();
			Thread.sleep(1000);
			
			
		}
	}
	
	driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]//div[1]//tbody//tr[4]//td[text()='"+date+"']")).click();
}
}
