package com.fm.rough;

import java.util.concurrent.TimeUnit;

import org.companyname.projectname.utilities.WebDriverUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTestNGRunner {
	
	
	@Test
	public void runTest(){
		WebDriver driver = WebDriverUtilities.webdriver();
		driver.navigate().to("http://www.google.com");
		
		
	}
	
	
	/*@Test
	public void browserTest(){
		System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
		driver.quit();
	}*/

}
