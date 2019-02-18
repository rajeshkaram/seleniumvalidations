package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class testcase {
     WebDriver driver;
     page login;
	String sheetName = "test";
	 
	 
	 	@BeforeTest
	 	public void setup() {
	 		
	 		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajesh.k\\Downloads\\chromedriver.exe");
	 		 driver=new ChromeDriver();
	 		driver.get("http://primusbank.qedgetech.com/");
	 		 
	 	}
	 	
	  @DataProvider
      public Object[][] getDataExcel() throws Exception{
		 
      Object data[][] = excelreader.getTestData(sheetName);
      return data;
	 }
	 
	 	 
	  
	 
	        @Test(dataProvider ="getDataExcel")
	       public void prime(String username,String password) {
	        	login=new page(driver);
	        	login.verifylogin(username, password);
	          
	      }
	        
	      
	
	    
		 


	}




