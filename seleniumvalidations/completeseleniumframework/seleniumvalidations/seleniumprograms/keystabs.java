package mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class keystabs {

	WebDriver driver;
	@Test
	public void mutiplewindow() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\completerajesh\\automation\\chromedriver.exe");	
	driver = new ChromeDriver(); 
	driver.get("http://primusbank.qedgetech.com/");
	WebElement webElement = driver.findElement(By.xpath("//*[@id=\'txtuId\']"));//You can use xpath, ID or name whatever you like
	webElement.sendKeys(Keys.TAB);
	webElement.sendKeys(Keys.ENTER);
	driver.findElement(By.xpath(""));
	
}
}