package mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class window {
WebDriver driver;
@Test
	public void wind() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\completerajesh\\automation\\chromedriver.exe");	
		driver = new ChromeDriver(); 
		driver.get("https://projects.qedgetech.com/banking");
		String parentHandle = driver.getWindowHandle(); // get the current window handle
		driver.findElement(By.xpath("//*[@id=\'post-81\']/div/div[3]/div[1]/p[6]/strong/a")).click(); // click some link that opens a new window

		for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
		}

		//code to do something on new window

		//driver.close(); // close newly opened window when done with it
		//driver.switchTo().window(parentHandle); // switch back to the original window
		driver.findElement(By.xpath("//*[@id='txtuId']")).sendKeys("Admin");
		driver.findElement(By.xpath("")).sendKeys("Admin");
		
		driver.findElement(By.xpath("username")).click();
	}
}
