package org.companyname.projectname.utilities;

import org.apache.log4j.Logger;

import cucumber.api.Scenario;

public class CucumberLogUtils {
	
	private static Logger logger = Logger.getLogger(CucumberLogUtils.class);
	public static boolean scenarioResult = true;
	
	public CucumberLogUtils(){
		
	}
	
	public static void logScreenShot(String msg){
		if(ScenarioContext.scenario.get() != null){
			((Scenario)ScenarioContext.scenario.get()).write(DateUtils.getLogTime() +":Screenshot: "+msg);
			if(ScenarioContext.isTakeScreenShots()){
				((Scenario)ScenarioContext.scenario.get()).embed(WebDriverUtils.getScreenShot, "image/png");
			}
		}
	}

}
