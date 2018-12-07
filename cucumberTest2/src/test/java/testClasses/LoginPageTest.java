package testClasses;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cucumber.cucumberTest2.TestBase;

import pageClasses.FacebookHomePage;
import pageClasses.FacebookLoginPage;
public class LoginPageTest extends TestBase{
	FacebookLoginPage fb;
	FacebookHomePage fb_home;
	@BeforeTest
	public void setup()
	{
		try {
			TestBase.initialization();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void loginTest()
	{
		fb=new FacebookLoginPage();
		fb.login("sivapothireddy474@gmail.com", "abhi_123");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//    .//*[@id='userNavigationLabel']
		
		driver.switchTo().alert().accept();
		
		
		fb_home = new FacebookHomePage();
		fb_home.logout();
		
		
		
	}
	
	@AfterTest
	public void close()
	{
		//TestBase.tearDown();
	}
	

}
