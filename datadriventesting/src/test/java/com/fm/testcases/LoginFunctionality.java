package com.fm.testcases;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.fm.basepackage.TestBase;

public class LoginFunctionality extends TestBase {
	
	@Parameters("browser")
	
	
	@Test(priority=0)
	public void testCustomerLogin() throws InterruptedException
	{
		log.debug("Inside login test...");
		driver.findElement(By.xpath(object_REPO.getProperty("managerLoginButton"))).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath(object_REPO.getProperty("addCustomerButton"))).click();
		
		
		//Assert.assertTrue(isElementPresent(By.xpath(object_REPO.getProperty("addCustomerButton"))), "Not logged in");
		//Thread.sleep(3000);
		
	}
	
	
	
	//@Test(priority=1)
	public void customerLoginCheck()
	{
		log.debug("checking whether customer successfully logged in or not...");
		String loggedInText = driver.findElement(By.xpath(object_REPO.getProperty("customerLoginCheck"))).getText();
		System.out.println("printed text:  "+loggedInText);
		Assert.assertEquals(loggedInText, object_REPO.getProperty("customerLoginVerify"));
	
	
	}

}
