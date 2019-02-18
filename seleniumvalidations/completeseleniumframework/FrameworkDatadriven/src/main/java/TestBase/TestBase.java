package TestBase;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ExcelReader.ExcelReader;
import Utility.util;

public class TestBase {
static WebDriver driver;
	
	public static ExtentReports extent;
	public static ExtentTest test;
	static {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		
		extent = new ExtentReports(System.getProperty("user.dir") + "\\src\\main\\java\\extentreport\\" + formater.format(calendar.getTime()) + ".html", false);
		
		
	}
	public String getScreenShot(String imagename) throws IOException{
		if(imagename.equals("")){
			imagename="blank";
		}
		File image=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String imagelocation=System.getProperty("user.dir")+"\\src\\main\\java\\screenshots\\";
		Calendar calendar=Calendar.getInstance();
		SimpleDateFormat formater=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		String actualimagename=imagelocation+imagename+"_"+formater.format(calendar.getTime())+".png";
		File destFile=new File(actualimagename);
		FileUtils.copyFile(image, destFile);
		return actualimagename;
	}
	
	


	public void getresult(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(LogStatus.PASS, result.getName() + " test is pass");
			String screen=getScreenShot("");
			test.log(LogStatus.PASS, test.addScreenCapture(screen));
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(LogStatus.SKIP, result.getName() + " test is skipped and skip reason is:-" + result.getThrowable());
		} else if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.ERROR, result.getName() + " test is failed" + result.getThrowable());
			String screen=getScreenShot("");
			test.log(LogStatus.FAIL, test.addScreenCapture(screen));
		} else if (result.getStatus() == ITestResult.STARTED) {
			test.log(LogStatus.INFO, result.getName() + " test is started");
		}
	}

	@AfterMethod()
	public void afterMethod(ITestResult result) throws IOException {
		getresult(result);
	}

	
	@BeforeMethod()
	public void beforeMethod(Method result) {
		test = extent.startTest(result.getName());
		test.log(LogStatus.INFO, result.getName() + " test Started");
	}

	@AfterClass(alwaysRun = true)
	public void endTest() {
		extent.endTest(test);
		extent.flush();
		
		
		
		
	}


	
	
	
	
	
	@Test(dataProvider="getCRMTestData")	
	public void login(String usert,String passg) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajesh.k\\Desktop\\chrome\\chromedriver.exe");	
		driver = new ChromeDriver(); 
		test.log(LogStatus.PASS,"browser launched");
		driver.get("http://primusbank.qedgetech.com/");
		test.log(LogStatus.PASS,"Entered application url");
	
	
util.waitForWebElement(driver,driver.findElement(By.xpath("//*[@id='txtuId']")),20).sendKeys(usert);

test.log(LogStatus.PASS,"Entered username");

util.waitForWebElement(driver,driver.findElement(By.xpath("//*[@id='txtPword']")),20).sendKeys(passg);
test.log(LogStatus.PASS,"Entered password");
util.waitForWebElement(driver,driver.findElement(By.xpath("//*[@id='loginn']")),20);
test.log(LogStatus.PASS,"clicked on submit");

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
	
		
	
	
	
	
	
	
	
}



	

			
			
	




