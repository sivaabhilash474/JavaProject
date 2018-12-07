package com.fm.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestAddingCustomer{
	@Test(dataProvider="supplyingData")
	public static void addCustomers(String fname, String lname, String zipcode) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		WebElement bankManagerButton = driver.findElement(By.xpath("//button[@ng-click='manager()']"));
		bankManagerButton.click();
		WebElement addCustomer = driver.findElement(By.xpath("//button[@ng-click='addCust()']"));
		addCustomer.click();
		WebElement firstName = driver.findElement(By.xpath("html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[1]/input"));
		firstName.sendKeys(fname);
		WebElement lastName = driver.findElement(By.xpath("html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[2]/input"));
		lastName.sendKeys(lname);
		WebElement postCode = driver.findElement(By.xpath("html/body/div[3]/div/div[2]/div/div[2]/div/div/form/div[3]/input"));
		postCode.sendKeys(zipcode);
		WebElement addCustomerButton = driver.findElement(By.xpath("html/body/div[3]/div/div[2]/div/div[2]/div/div/form/button"));
		addCustomerButton.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		
		
		
	}
	
	@DataProvider(name="supplyingData")
	public Object[][] supplyData()
	{
		Object data[][] = new Object[2][3];
		data[0][0] = "rahul";
		data[0][1] = "shetty";
		data[0][2] = "2322";
		
		data[1][0] = "siva";
		data[1][1] = "kalyan";
		data[1][2] = "2222";
		
		
		return data;
	}
	
	
	

}
