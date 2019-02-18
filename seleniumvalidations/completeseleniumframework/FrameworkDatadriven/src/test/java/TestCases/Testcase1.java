package TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import ExcelReader.ExcelReader;
import TestBase.TestBase;

public class Testcase1 extends TestBase{

	String sheetName = "testdata";
		
	TestBase testcase1;
	
	
		
		public void loginTest(String us, String pa) throws Exception {
	    	 
	            testcase1.login(us, pa);
	           
		
	}
		
		@DataProvider
		public Object[][] getCRMTestData(){
			Object data[][] = ExcelReader.getTestData(sheetName);
			return data;
		}
	}
	
	

