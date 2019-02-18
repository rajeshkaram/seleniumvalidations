package com.orion.automation.desktopapplications;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class desktop {
	String sheetName = "cal";
	 
		@Test(priority=1,dataProvider="getCRMTestData")	
		public void calc(String first,String second) throws MalformedURLException, InterruptedException {
		DesktopOptions option=new DesktopOptions();
		option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		WiniumDriver driver=new WiniumDriver(new URL("http://localhost:9999"),option);
		Thread.sleep(3000);
		driver.findElement(By.id("CalculatorResults")).sendKeys(first);
		driver.findElement(By.name("Plus")).click();
		driver.findElement(By.id("CalculatorResults")).sendKeys(second);
		
         WebElement result= driver.findElement(By.name("Equals"));
          result.click();
          
             
        
	} 
		@DataProvider
		public Object[][] getCRMTestData(){
			Object data[][] = testreader.getTestData(sheetName);
			return data;
		}
      
         
	}


