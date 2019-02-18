package com.orion.automation.desktopapplications;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class exceldesktop {

	
	public class desktop {
		
		 
			@Test
			public void calc() throws MalformedURLException, InterruptedException {
			DesktopOptions option=new DesktopOptions();
			option.setApplicationPath("C:\\Program Files (x86)\\Microsoft Office\\Office15\\EXCEL.EXE");
			WiniumDriver driver=new WiniumDriver(new URL("http://localhost:9999"),option);
			Thread.sleep(3000);
			
			driver.findElement(By.name("Blank workbook")).click();

			driver.findElement(By.name("Insert")).click();
			driver.findElement(By.name("Page Layout")).click();
					
			driver.findElement(By.name("Formulas")).click();
					
			driver.findElement(By.name("Data")).click();
					
			driver.findElement(By.name("Review")).click();
				
			driver.findElement(By.name("TEAM")).click(); 
					
			driver.findElement(By.name("Home")).click();
			driver.findElement(By.name("Shading")).click();
			
			Thread.sleep(3000);
					
			
			driver.findElement(By.name("File Tab")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("Save")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("Computer")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("Desktop")).click();

			Thread.sleep(3000);
			driver.findElement(By.name("File name:")).sendKeys("ex");
			Thread.sleep(3000);
			driver.findElement(By.name("Save")).click();

			


		} 
			
			}
	      
	           
	          
		}



