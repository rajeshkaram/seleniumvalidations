package mavenproject;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class da {
	WebDriver driver;
	@Test
	public void datepicker() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\completerajesh\\automation\\chromedriver.exe");	
	driver = new ChromeDriver(); 
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://www.phptravels.net/");
	driver.manage().window().maximize();
	
	//Thread.sleep(3000);
	WebElement date=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
	
	//Thread.sleep(3000);
	   String dateval="5-3-2019";
	   selectDateby(driver, date, dateval);
	}

	public static void selectDateby(WebDriver driver,WebElement element,String dateval){

	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguments[0].setAttribute('value','"+dateval+"');",element);
	}
}