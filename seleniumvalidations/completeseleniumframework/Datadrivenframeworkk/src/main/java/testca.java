import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class testca extends ext {
@Test
	
	public void login () throws IOException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\rajesh.k\\\\Desktop\\\\chrome\\\\chromedriver.exe");
		driver=new ChromeDriver();
         test.log(LogStatus.PASS,"browser launched");
		driver.get("http://primusbank.qedgetech.com/");
		test.log(LogStatus.PASS,"applicaton url launched");
	WebElement ele=	driver.findElement(By.xpath("//*[@id='txtuId']"));
	highLightElement(driver, ele);
	ele.sendKeys("Admin");
	
		test.log(LogStatus.PASS,"enter username");
	WebElement ele1=driver.findElement(By.xpath("//*[@id='txtPword']"));
	highLightElement(driver, ele1);
	ele1.sendKeys("Admin");
		
		test.log(LogStatus.PASS,"enter password");
		
		WebElement ele3=driver.findElement(By.xpath("//*[@id='logi']"));
		highLightElement(driver, ele3);
		ele3.click();
		
		test.log(LogStatus.PASS,"click on login button");
	
		driver.close();
		//test.log(LogStatus.PASS,"closed the browser");
		
	}
		
			
			
			
}
