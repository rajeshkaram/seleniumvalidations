package com.orion.automation.Applicationfactory;



public class DataProviderFactory {

	public static com.orion.automation.DataProvider.ConfigDataProvider getConfig()
	{
		com.orion.automation.DataProvider.ConfigDataProvider config=new com.orion.automation.DataProvider.ConfigDataProvider();
		
		return config;
	}
	
	public static com.orion.automation.DataProvider.ExcelDataProvider getExcel()
	{
		com.orion.automation.DataProvider.ExcelDataProvider excel=new com.orion.automation.DataProvider.ExcelDataProvider();
		
		return excel;
	}
	
	
	
}