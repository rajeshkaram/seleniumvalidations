package mavenproject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class datepicker {
	WebDriver driver;
	 
	 @BeforeTest
	 public void start(){
	 
		 System.setProperty("webdriver.chrome.driver", "E:\\completerajesh\\automation\\chromedriver.exe");	
			driver = new ChromeDriver();
	 }
	 
	 @org.testng.annotations.Test
	 public void Test(){
	 
	  driver.get("http://jqueryui.com/datepicker/");
	 
	  driver.switchTo().frame(0);
	 
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 
	  //Click on textbox so that datepicker will come
	  driver.findElement(By.id("datepicker")).click();
	 
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 
	  //Click on next so that we will be in next month
	  driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
	 //overall date table will be selected
	  WebElement dateWidget = driver.findElement(By.id("ui-datepicker-div"));
	 
	  List rows=dateWidget.findElements(By.tagName("tr"));
	 
	  List<WebElement> columns=dateWidget.findElements(By.tagName("td"));
	 
	  for(WebElement cell:columns){
	 
	   //Select 10th Date
	   if (cell.getText().equals("20")){
	 
	   cell.findElement(By.linkText("20")).click();
	 
	   break;
	 
	   }
	 
	  }
	 
	 }
	 
	}