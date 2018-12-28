package org.companyname.projectname.utilities;

public class QcTestResult {

	private final String scenarioName;
	private final String scenarioResult;
	private final String scenarioResultsPath;
	
	public QcTestResult(String scenarioName, String scenarioResult, String scenarioResultsPath){
		this.scenarioName = scenarioName;
		this.scenarioResult = scenarioResult;
		this.scenarioResultsPath = scenarioResultsPath;
		
		
	}
	
	public String getScenarioName(){return this.scenarioName;}
	
	public String getScenarioResult(){return this.scenarioResult;}
	
	public String getScenarioResultPath(){return this.scenarioResultsPath;}
	
	
}
