package com.fm.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindingElement {
	
	@Test
	public void testingElements()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement customer_button = driver.findElement(By.xpath("//button[@ng-click='customer()']"));
		customer_button.click();
		WebElement element = driver.findElement(By.xpath("//label[contains(text(),'Your Name :')]"));
		System.out.println(element.getText());
	}

}
