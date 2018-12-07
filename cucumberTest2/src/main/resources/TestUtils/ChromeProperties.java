package TestUtils;

import org.aspectj.weaver.loadtime.Options;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeProperties {
	@Test
	public void loginTest()
	{
	ChromeOptions options = new ChromeOptions();
	options.addArguments("user-data-dir=C:\\Users\\sivaa\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
	options.addArguments("disable-popup-blocking");
	
	
	
	}
	
	// C:\Users\sivaa\AppData\Local\Google\Chrome\User Data\Default
}
