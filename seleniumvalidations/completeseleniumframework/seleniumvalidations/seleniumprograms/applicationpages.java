package mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.testng.Assert;




public class applicationpages {
	static WebDriver driver;
	String sheetName = "test";
	
	
	
	
		
	@Test(priority=1,dataProvider="getCRMTestData")	
	public void login(String usert,String passg,String branchname,String address1,String address2,String area,String zipcode,String country,String state,String city) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajesh.k\\Desktop\\chrome\\chromedriver.exe");	
		driver = new ChromeDriver(); 
		driver.get("http://primusbank.qedgetech.com/");
	

		driver.findElement(By.xpath("//*[@id='txtuId']")).sendKeys(usert);
		driver.findElement(By.xpath("//*[@id='txtPword']")).sendKeys(passg);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='login']")).click();
		driver.findElement(By.xpath("//img[@src='images/Branches_but.jpg']")).click();
		driver.findElement(By.xpath("//*[@id=\'BtnNewBR\']")).click();
		driver.findElement(By.xpath("//*[@id=\"txtbName\"]")).sendKeys(branchname);
		driver.findElement(By.xpath("//*[@id=\'txtAdd1\']")).sendKeys(address1);
		driver.findElement(By.xpath("//*[@id=\'Txtadd2\']")).sendKeys(address2);
		driver.findElement(By.xpath("//*[@id=\'txtArea\']")).sendKeys(area);
		driver.findElement(By.xpath("//*[@id=\'txtZip\']")).sendKeys(zipcode);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//select[@name='lst_counrtyU']")).sendKeys(country);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//select[@name='lst_stateI']")).sendKeys(state);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//select[@name='lst_cityI']")).sendKeys(city);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'btn_insert\']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
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
		Object data[][] = Testutil.getTestData(sheetName);
		return data;
	}
	
	
	
	
}







