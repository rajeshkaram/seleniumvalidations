package mavenproject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class brokenlinks {
	WebDriver driver;
	
	@Test
	
	public void brokenlinks() throws MalformedURLException, IOException  {

		System.setProperty("webdriver.chrome.driver", "E:\\completerajesh\\automation\\chromedriver.exe");	
		driver = new ChromeDriver(); 
		driver.get("https://www.flipkart.com/");
	
	
	//links--//a href<http://www.google.com
		//images--//img href<http://www.test.com>
		//1.get the list of all the links and images:500
		List<WebElement>linkslist=driver.findElements(By.tagName("a"));
		linkslist.addAll( driver.findElements(By.tagName("img")));
		System.out.println("size of afull links and images---->"+linkslist.size());

		List<WebElement>activelinks=new ArrayList<WebElement>();//450

		//2.itearate linkslist:exclude all the links/images-doesnot have any href attributes

		for(int i=0;i<linkslist.size();i++){

		System.out.println(linkslist.get(i).getAttribute("href"));
		if(linkslist.get(i).getAttribute("href")!=null && (!linkslist.get(i).getAttribute("href").contains("javascript"))){
		activelinks.add(linkslist.get(i));
		}
		}

		//get the size of active links list:

		System.out.println("size of active links and images------>"+activelinks.size());


		//3.check the href url, with httpconnection api:

		//200---ok
		//404--not found
		//500--internal error
		//400--bad request

		for(int j=0;j<activelinks.size();j++){

		HttpURLConnection connection=(HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
		connection.connect();
		String response=connection.getResponseMessage();//ok
		connection.disconnect();
		System.out.println(activelinks.get(j).getAttribute("href")+"------>"+response);
	}

	
}
}


	