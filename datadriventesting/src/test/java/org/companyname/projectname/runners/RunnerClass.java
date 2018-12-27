package org.companyname.projectname.runners;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/features",
		glue= {"src/test/java/org.companyname.projectname.runners"},
		plugin = { },
		monochrome = true
		//tags="@vanillaLogin"
		)
public class RunnerClass {
	
	

}
