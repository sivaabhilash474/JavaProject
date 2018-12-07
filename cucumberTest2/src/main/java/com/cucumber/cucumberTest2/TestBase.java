package com.cucumber.cucumberTest2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis; 
	
	public static void initialization() throws IOException
	{
		if(driver==null)
		{
			
			prop = new Properties();
			fis = new FileInputStream("C:\\Users\\sivaa\\workspace\\cucumberTest2\\src\\main"
					+ "\\resources\\properties\\config.properties");
			
			prop.load(fis);
			
			if(prop.getProperty("browser").equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("user-data-dir=C:\\Users\\sivaa\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
				options.addArguments("disable-popup-blocking");
				driver = new ChromeDriver(options);
			}
			
			else if(prop.getProperty("browser").equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "c:\\selenium\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			
			driver.get(prop.getProperty("testURL"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("user-data-dir=C:\\Users\\sivaa\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
			options.addArguments("disable-popup-blocking");
			
			
		}
		
		
		
	}
	
	public static void tearDown()
	{
		
			driver.close();
		
	}

}
