package ApplicationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import ExcelReader.ExcelReader;
import TestBase.TestBase;
import utility.utility;



public class Applicationpages extends TestBase{
	static WebDriver driver;
	String sheetName = "testdata";
	
	
		
		
	@Test(priority=1,dataProvider="getCRMTestData")	
	public void login(String usert,String passg) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajesh.k\\Desktop\\chrome\\chromedriver.exe");	
		driver = new ChromeDriver(); 
		test.log(LogStatus.PASS,"browser launched");
		driver.get("http://primusbank.qedgetech.com/");
		test.log(LogStatus.PASS,"Entered application url");
	
	

		WebElement usr= driver.findElement(By.xpath("//*[@id='txtuId']"));
		highLightElement(driver, usr);
		usr.sendKeys(usert);
		test.log(LogStatus.PASS,"Entered username");
		WebElement pas= driver.findElement(By.xpath("//*[@id='txtPword']"));
		highLightElement(driver, pas);
		pas.sendKeys(passg);
		test.log(LogStatus.PASS,"Entered password");
		
		Thread.sleep(3000);
	    WebElement log=	driver.findElement(By.xpath("//*[@id='loginn']"));
	   highLightElement(driver, log);
	    log.click();
		test.log(LogStatus.PASS,"clicked on login");
		
		driver.close();
		
		
	}
		//driver.getCurrentUrl();
	
		
		//String actualtitle = driver.getTitle();
		//Assert.assertEquals("Primus BANK123", actualtitle);
		//System.out.println("hi");
		
		//verifytext();
		
	
	
	/*@Test(priority=2)
		public void verifytext() {
			if(driver.getTitle().contains("Primus BANK")) 
				
				System.out.println("tite is present ");
			else
				System.out.println("title is not present ");
			
	}
		//driver.close();
		
		*/
	
		
	
	
	@DataProvider
	public Object[][] getCRMTestData(){
		Object data[][] = ExcelReader.getTestData(sheetName);
		return data;
	}
	
	
	
	
}




