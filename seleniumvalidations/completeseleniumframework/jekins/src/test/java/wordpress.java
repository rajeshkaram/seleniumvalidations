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
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;






public class wordpress {

	
	
	WebDriver driver;
	
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
		String imagelocation=System.getProperty("user.dir")+"\\src\\main\\java\\screenshot\\";
		Calendar calendar=Calendar.getInstance();
		SimpleDateFormat formater=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		String actualimagename=imagelocation+imagename+"_"+formater.format(calendar.getTime())+".png";
		File destFile=new File(actualimagename);
		FileUtils.copyFile(image, destFile);
		return actualimagename;
	}
	
	public static void highLightElement(WebDriver driver, WebElement element) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

		try 
		{
			Thread.sleep(500);
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e.getMessage());
		}

		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);

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



	

	@Test(dataProvider="wordpress")
	
	public void login (String username,String password) throws IOException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
         test.log(LogStatus.PASS,"browser launched");
		driver.get("http://primusbank.qedgetech.com/");
		test.log(LogStatus.PASS,"applicaton url launched");
	WebElement ele=	driver.findElement(By.xpath("//*[@id='txtuId']"));
	highLightElement(driver, ele);
	ele.sendKeys(username);
	
		test.log(LogStatus.PASS,"enter username");
	WebElement ele1=driver.findElement(By.xpath("//*[@id='txtPword']"));
	highLightElement(driver, ele1);
	ele1.sendKeys(password);
		
		test.log(LogStatus.PASS,"enter password");
		
		WebElement ele3=driver.findElement(By.xpath("//*[@id='login']"));
		highLightElement(driver, ele3);
		ele3.click();
		
		test.log(LogStatus.PASS,"click on login button");
	
		//driver.close();
		//test.log(LogStatus.PASS,"closed the browser");
		
	}
}