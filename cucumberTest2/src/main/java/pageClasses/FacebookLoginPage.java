package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.cucumberTest2.TestBase;

public class FacebookLoginPage extends TestBase{

	@FindBy(css="#email")
	WebElement username;
	
	@FindBy(css="#pass")
	WebElement password;
	
	@FindBy(xpath=".//*[@id='loginbutton']")
	WebElement loginButton;
	
	public FacebookLoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void setPassword(String pass)
	{
		
		password.sendKeys(pass);
	}
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
	
	
	public void login(String uname, String pass)
	{
		this.setUsername(uname);
		this.setPassword(pass);
		this.clickLoginButton();
	}
}
