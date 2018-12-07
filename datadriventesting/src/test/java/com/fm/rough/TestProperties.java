package com.fm.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	
	
	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		//System.out.println(System.getProperty("user.dir"));
		Properties config = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\config.properties");
		config.load(fis);
		System.out.println(config.getProperty("browser"));
		System.out.println(config.getProperty("testSiteURL"));
		Properties object_REPO = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\objectRepository.properties");
		object_REPO.load(fis);
		System.out.println(object_REPO.getProperty("managerLoginButton"));
		//driver.findElement(object_REPO.getProperty("managerLoginButton")).click();
	}

}
