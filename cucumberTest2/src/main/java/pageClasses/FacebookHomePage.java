package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cucumber.cucumberTest2.TestBase;

public class FacebookHomePage extends TestBase{
	
	@FindBy(id="logoutMenu")
	public static WebElement logoutMenu;
	
	@FindBy(xpath=".//*[@id='js_2v']/div/div/ul/li[18]/a/span/span")
	WebElement logOutOption;
	
	
	
	public void logout()
	{
		logoutMenu.click();
		logOutOption.click();
	}

}
