package mavenproject;

import java.security.Key;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mutilpletabslinks {
	
	WebDriver driver;
	@Test
	public void mutiplewindow() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\completerajesh\\automation\\chromedriver.exe");	
	driver = new ChromeDriver(); 
	WebDriver driver=new ChromeDriver();
	driver.get("http://openclinic.sourceforge.net/openclinic/home/index.php");
	
	String selectlinknewtab=Keys.chord(Keys.CONTROL,Keys.RETURN);
		
		driver.findElement(By.linkText("Medical Records")).sendKeys(selectlinknewtab);
		ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

}
}
