package stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.cucumber.cucumberTest2.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageClasses.FacebookLoginPage;

public class FacebookLoginSteps extends TestBase{
FacebookLoginPage fb;


	@Given("^User navigated to the login page$")
	public void user_navigated_to_the_login_page() throws Throwable {
   System.out.println("@Given-----user is on the login page");
   TestBase.initialization();
	}
	@When("^Entered \"([^\"]*)\" as username and \"([^\"]*)\" as password$")
	public void entered_as_username_and_as_password(String username, String password) throws Throwable {
	    fb=new FacebookLoginPage();
		fb.login(username, password);
	    
	}

	
	@Then("^User \"([^\"]*)\" to home page$")
	public void user_to_home_page(String validateLogin) throws Throwable {
		System.out.println("@Then----user "+validateLogin+" homepage");
	}


@Then("^close the browser$")
public void close_the_browser() throws Throwable {
    TestBase.tearDown();
}
}
