package com.fm.basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.fm.utilities.ExcelReader2;

/*
 * Base class is Super class or parent class for all test cases where
 * all initializations will be done in side this class.
 * 
 * We can initialize.....
 *
 * WebDriver----done
 * Properties---done
 * Logs---log4j jar, .log, log4j.properties
 * ExtentReports
 * ReportNG
 * DB
 * Excel
 * Mailing  
 * 
 * 
 */
public class TestBase {
	
	public static WebDriver driver;
	public static Properties config;
	public static Properties object_REPO;
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader2 excel = new ExcelReader2("C:\\Users\\sivaa\\workspace\\datadriventesting\\src\\test\\resources\\excel\\testData.xlsx");
	public static WebDriverWait wait;
	@BeforeSuite
	public void setup()
	{
		//this method should be called before any test case(test1.java,test2.java) (in the class)
		//any test case means not only in the class, in a particular suite. In as suite
		//we may have 100 test cases so before we call any of those test cases
		 
	if(driver==null)
	{
		config = new Properties();
		 try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			config.load(fis);
			log.debug("config file loaded....");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(config.getProperty("browser"));
		//System.out.println(config.getProperty("testSiteURL"));
		object_REPO = new Properties();
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\objectRepository.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			object_REPO.load(fis);
			log.debug("object_REPO loaded....");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(config.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
			log.debug("chrome loaded");
		}
		
		else if(config.getProperty("browser").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get(config.getProperty("testSiteURL"));
		log.debug("Navigated to: "+config.getProperty("testSitURLasManager"));
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicitWait")), TimeUnit.SECONDS);
		
		wait = new WebDriverWait(driver,5);
		
		
		
	}
		
	}
	
	public boolean isElementPresent(By by)
	{
		try{
			driver.findElement(by);
			return true;
		}
		catch(NoSuchElementException e)
		{
			return false;
		}
	}
	
	
	@AfterSuite
	public void tearDown()
	{
		if(driver!=null)
		{
			driver.quit();
		}
		
		log.debug("Test execution completed...");
	}
	
	
	
	
	
	
	
	
	
	
	

}
