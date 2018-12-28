package org.companyname.projectname.utilities;

import java.io.File;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;

public class ScenarioContext {

	public static ThreadLocal<WebDriver> webDriver = new ThreadLocal();
	public static Properties localConf;
	public static ThreadLocal<Scenario> scenario = new ThreadLocal();
	public static ThreadLocal<String> dataFilePath = new ThreadLocal();
	public static ThreadLocal<String> sauceSessionId = new ThreadLocal();
	public static ThreadLocal<QcTestResult> currentQcResultTL = new ThreadLocal();
	public static String SCENARIO_NAME_PROPERTY_NAME = "scenarioName";
	public static String USE_SCENARIO_NAME_PROPERTY = "useDefinedScenarioName";
	
	public ScenarioContext(){
		
	}
	
	public static void setDataFile(String scenarioName, String dataDir){
		String driverFile = dataDir +File.separator +"driver.xls";
		String excelColumnName = "scenarioName";
		scenarioName = scenarioName.trim();
		
		try{
			Map<String,String> dataValues = ExcelUtils.getRowDataByRowValue(new File(driverFile), excelColumnName, scenarioName);
			String dataFileColumnName = "dataFilePath";
			if(!dataValues.isEmpty()){
				dataFilePath.set(dataDir +File.separator + (String)dataValues.get(dataFileColumnName));
			}
			
		}
		
		catch(Exception var6){
			;
		}
	}
	
	public static String getScenarioName(){
		String scenarioName = "";
		if(scenario.get() != null){
			scenarioName = ((Scenario)scenario.get()).getName();
			CucumberLogUtils.logToConsole("Scenario Name: "+scenarioName);
		}
		return scenarioName;
	}
	
	public static String getScenarioUniqueID(){
		String scenarioID = "";
		if(scenario.get() != null){
			CucumberLogUtils.logToConsole("Scenario Name: "+((Scenario)scenario.get()).getName();
			scenarioID = ((Scenario)scenario.get()).getId();
			scenarioID = scenarioID.replaceAll("[^a-zA-Z0-9.-]", "_");
			CucumberLogUtils.logToConsole("Scenario ID: "+scenarioID);
		}
		return scenarioID;
	}
	
	public static QcTestResult getCurrentQcResult(){return (QcTestResult)currentQcResultTL.get();}
	
	
	public static void setCurrentQcResult(QcTestResult currentQcResult){currentQcResultTL.set(currentQcResult);}
	
	
//	public static void cleanCurrentQcResult(){currentQcResultTL.set((Object)null);}
	
	public static void cleanCurrentQcResult(){currentQcResultTL.set(getCurrentQcResult());}
	
	
	public static String getBrowserID(){return localConf.getProperty("browser");}
	
	
	public static boolean isTakeScreenShots(){return "true".equals(localConf.getProperty("takeScreenShots"));}
	
	
	public static boolean isLogLevelDebug(){return "debug".equals(localConf.getProperty("logLevel"));}
	
	
}
