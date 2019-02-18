package excelreader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.LogStatus;

public class parameter extends Testbase{
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","E:\\completerajesh\\automation\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
 
		driver.get("http://primusbank.qedgetech.com/");
		Xls_Reader reader=new Xls_Reader("C:\\Users\\rajesh.k\\Desktop\\testdata.xlsx");
		
		int rowCount=reader.getRowCount("Login");
		
		for(int rowNum=2;rowNum<=rowCount;rowNum++) {
			
			String username=reader.getCellData("login", "username", rowNum);
			System.out.println(username);
			String password=reader.getCellData("login", "password", rowNum);
			System.out.println(password);
	//Testbase.waitForWebElement(driver,driver.findElement(By.xpath("//*[@id=\'txtuId\']")),20));
	 Testbase.waitForWebElement(driver,driver.findElement(By.xpath("//*[@id=\'txtuId\']")), 20).sendKeys(username);
			Testbase.waitForWebElement(driver,driver.findElement(By.xpath("//*[@id=\'txtPword\']")) ,20).sendKeys(password);
		//Logger.log(LogStatus.PASS, "Test Completed Successfully");
		
	Testbase.waitForWebElement(driver, driver.findElement(By.xpath("//*[@id=\'login\']")), 20).click();
			driver.close();
		}
	}
}