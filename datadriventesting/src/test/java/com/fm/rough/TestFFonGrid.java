package com.fm.rough;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestFFonGrid {
	
	@Test
	public void test1() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setPlatform(Platform.WINDOWS);
		
		URL url = new URL("http://localhost:4444/wd/hub");
		WebDriver driver = new RemoteWebDriver(url, cap);
		
	}

}
