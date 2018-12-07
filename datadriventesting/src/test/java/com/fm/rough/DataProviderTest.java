package com.fm.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fm.utilities.ExcelReader2;

public class DataProviderTest{
	
	
	@Test(dataProvider="wordPressData")
	public void wordPressLogin(String username, String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement userNameField = driver.findElement(By.xpath("//input[@id='user_login']"));
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='user_pass']"));
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='wp-submit']"));
		//userNameField.clear();
		userNameField.sendKeys(username);
		//passwordField.clear();
		passwordField.sendKeys(password);
		loginButton.click();
		Thread.sleep(5000);
		driver.quit();
	}
	
	@DataProvider(name="wordPressData")
	public Object[][] getData()
	{
		ExcelReader2 excelFile = new ExcelReader2("C:\\Users\\sivaa\\workspace\\datadriventesting\\src\\test\\resources\\excel\\testData.xlsx");
		int row = excelFile.getRowCount("AddCustomer");
		int column = excelFile.getRowCount("AddCustomer");
		
		Object[][] data = new Object[row][column];
		data[0][0] = "admin";
		data[0][1] = "pass1";
		
		data[1][0] = "admin2";
		data[1][1] = "pass2";
		
		data[2][0] = "admin";
		data[2][1] = "demo123";
		
		return data;
		
		
	}
	

}
