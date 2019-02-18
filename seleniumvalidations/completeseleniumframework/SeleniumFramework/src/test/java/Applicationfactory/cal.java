package Applicationfactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\rajesh.k\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
 
		driver.get("https://www.freecrm.com/index.html");
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("backspace");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("backspace");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().frame(1);
		WebElement com=driver.findElement(By.xpath("//a[@title='Companies']"));
		Actions action=new Actions(driver);
		action.moveToElement(com).build().perform();
		driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[3]/ul/li[2]/a")).click();
				
		driver.findElement(By.xpath("//img[@id='f_trigger_c_birthday']")).click();
		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[5]/td[7]")).click();
					
	}
}
