package org.companyname.projectname.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverUtilities {
	
	static WebDriver driver;
	public static WebDriver webdriver(){
		
		String logFilePath = "C:\\Users\\sivaa\\git\\JavaProject\\datadriventesting\\src\\test\\resources\\browserLogs\\log.txt";
		
		System.setProperty("webdriver.chrome.driver","c:\\selenium\\geckodriver.exe");
		System.setProperty("webdriver.firefox.marionette","c:\\selenium\\geckodriver.exe" );
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, logFilePath);
		
		
		
		driver = new FirefoxDriver();
		
		return driver;
		
	}

}
