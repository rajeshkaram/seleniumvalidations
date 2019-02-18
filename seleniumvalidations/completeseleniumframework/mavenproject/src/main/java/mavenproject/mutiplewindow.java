package mavenproject;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mutiplewindow {
	WebDriver driver;
	@Test
	public void mutiplewindow() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\completerajesh\\automation\\chromedriver.exe");	
	driver = new ChromeDriver(); 
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	String parent=driver.getWindowHandle();
	System.out.println("parent window id is "+parent);
	Set<String>allwindows=driver.getWindowHandles();
	ArrayList<String>tabs=new ArrayList<>(allwindows);
	driver.switchTo().window(tabs.get(2));
	driver.close();
	driver.switchTo().window(tabs.get(1));

	driver.close();
	driver.switchTo().window(tabs.get(0));
	
	
	System.out.println("Ttile of parent window is "+driver.getTitle());
}
}
