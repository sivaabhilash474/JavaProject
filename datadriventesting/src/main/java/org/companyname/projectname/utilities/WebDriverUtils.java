package org.companyname.projectname.utilities;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.log4testng.Logger;

public class WebDriverUtils {

	private static final Logger logger = Logger.getLogger(WebDriverUtils.class);
	private static File ffDownloadsFolder = null;
	
	public WebDriverUtils(){
		
	}
	
	public static File getFfDownloadsFolder(){
		return ffDownloadsFolder;
	}
	
	private static void setFfDownloadsFolder(File ffDownloadsFolder){
		ffDownloadsFolder = ffDownloadsFolder;
	}
	
	public static WebDriver getNewDriver(){
		String browser = ScenarioContext.getBrowserID();
		DesiredCapabilities capabilities;
		if("ie".equals(browser)){
			capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability("ignoreProtectedModeSettings", Boolean.TRUE);
			capabilities.setCapability("ignoreZoomSetting", Boolean.TRUE);
			WebDriver driver = new InternetExplorerDriver(capabilities);
			driver.manage().window().maximize();
			return driver;
		}
		else if("firefox".contentEquals(browser)){
			FirefoxProfile ffProfile = (new ProfilesIni()).getProfile("default");
			DesiredCapabilities dc = DesiredCapabilities.firefox();
			if(ffProfile == null){
				ffProfile = new FirefoxProfile();
			}
			
			ffProfile.setPreference("signon.autologin.proxy", true);
			String ffDownloadsFolderPath = LocalConfUtils.getRootDir() + File.separator +"target" +File.separator + "firefox_downloads";
			(new File(ffDownloadsFolderPath)).mkdirs();
			setFfDownloadsFolder(new File(ffDownloadsFolderPath));
			ffProfile.setPreference("browser.download.folderList", 2);
			ffProfile.setPreference("browser.download.manager.showWhenStarting", false);
			ffProfile.setPreference("browser.download.manager.showAlertInterval", 1);
			ffProfile.setPreference("browser.download.manager.showAlertOnComplete", false);
			ffProfile.setPreference("browser.download.manager.closeWhenDone", true);
			ffProfile.setPreference("browser.download.dir", ffDownloadsFolderPath);
			ffProfile.setPreference("browser.helperApps.alwaysAsk.force", false);
			ffProfile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/xml,application/octet-stream, text/xml, text/csv, application/vnd.ms-excel, application/csv, text/plain, application/vnd.openxmlformats-officedocument.spreadsheetm1.sheet");
			dc.setCapability("firefox_profile", ffProfile);
			dc.setCapability("marionette", false);
			WebDriver driver = new FirefoxDriver(dc);
			driver.manage().window().maximize();
			return driver;
		}
		else if("chrome".equals(browser)){
			capabilities = DesiredCapabilities.chrome();
			ChromeOptions options = new ChromeOptions();
			options.addArguments(new String[] {"test-type"});
			options.addArguments(new String[] {"--disable-extensions"});
			options.addArguments(new String[] {"--start-maximized"});
			capabilities.setCapability("chromeOptions", options);
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
			
		}
		else if("phantomjs".equals(browser)){
			capabilities = new DesiredCapabilities();
			capabilities.setJavascriptEnabled(true);
			capabilities.setCapability("takeScreeshot", true);
			capabilities.setCapability("phantomjs.cli.args", new String[] {"--web-security=no","--ignore-ssl-errors=yes"});
			WebDriver driver = new PhantomJSDriver(capabilities);
			return driver;
		}
	}
	
	
}
