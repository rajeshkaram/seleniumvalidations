package mavenproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdown {

	WebDriver driver;
	@Test
	public void mutiplewindow() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\completerajesh\\automation\\chromedriver.exe");	
	driver = new ChromeDriver(); 
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
List<WebElement>dropdown=driver.findElements(By.tagName("select"));
	System.out.println("total no of dropdown"+dropdown.size());
	
	for(int i=0;i<=dropdown.size();i++) {
		
		System.out.println(dropdown.get(i).getText());
	}
	


	}
}


