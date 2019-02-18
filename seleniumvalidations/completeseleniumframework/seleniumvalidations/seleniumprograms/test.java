package mavenproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {
//@Test
	public void verifyradiobutton() {
		//verify radio button equals attribute value
		System.setProperty("webdriver.chrome.driver", "E:\\completerajesh\\automation\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		String value="Water";
		List<WebElement>radio=driver.findElements(By.xpath("//input[@name='group2' and @type='radio']"));
		for(int i=0;i<radio.size();i++) {
		
			if(radio.get(i).getAttribute("value").equals(value)) {
				radio.get(i).click();
			}
		}
	}

//@Test
public void verifycheckbox() {
	//verify check box equals attribute value
	System.setProperty("webdriver.chrome.driver", "E:\\completerajesh\\automation\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.echoecho.com/htmlforms10.htm");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//td[@valign='top']//following-sibling::a[@href='htmlforms09.htm']")).click();
	String value="Milk";
	List<WebElement>check=driver.findElements(By.xpath("//input[@name='option3' and @type='checkbox']"));
	for(int i=0;i<check.size();i++) {
	
		if(check.get(i).getAttribute("value").equals(value)) {
			check.get(i).click();
		}
	}
}


@Test
public void verifytooltip() {
	System.setProperty("webdriver.chrome.driver", "E:\\completerajesh\\automation\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.echoecho.com/htmlforms10.htm");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//td[@valign='top']//following-sibling::a[@href='htmlforms09.htm']")).click();
	//String value="Milk";
	List<WebElement>check=driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(int i=2;i<=check.size();i++) {
	
		
		//if(check.get(i).getAttribute("value").equals(value)) {
			check.get(i).click();
		}
	}
}


	

	


