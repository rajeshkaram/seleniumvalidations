package mavenproject;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class everystepscreenshot {
	
WebDriver driver;
	@Test
	public void everystepcaptureScreenshot() throws Exception
	{
	 
		System.setProperty("webdriver.chrome.driver", "E:\\completerajesh\\automation\\chromedriver.exe");	
		driver = new ChromeDriver(); 
	 
	// Maximize the browser
	driver.manage().window().maximize();
	 
	// Pass application url
	driver.get("http://www.facebook.com");
	
	driver.findElement(By.xpath("//*[@id=\"u_0_j\"]")).sendKeys("admin");
everystepscreenshot.captureScreenshot(driver, "firstname");
	driver.findElement(By.xpath("//*[@id=\"u_0_v\"]")).sendKeys("admin");
	everystepscreenshot.captureScreenshot(driver, "lastname");
	}
	
	
	
	
	
	
	public static void captureScreenshot(WebDriver driver,String screenshotName)
	{
	 
	try 
	{
	TakesScreenshot ts=(TakesScreenshot)driver;
	 
	File source=ts.getScreenshotAs(OutputType.FILE);
	 
	FileUtils.copyFile(source, new File("./Screenshots/"+screenshotName+".png"));
	 
	System.out.println("Screenshot taken");
	} 
	catch (Exception e)
	{
	 
	System.out.println("Exception while taking screenshot "+e.getMessage());
	} 
	}
	
}


