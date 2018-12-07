package com.cucumber.cucumberTest2;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue="stepdefinitions",
				 tags={"@Facebook"},
				 format={"pretty","html:target/cucumber-html-report"},
				 monochrome=true,
				 dryRun = false)

/*
@CucumberOptions(
	    //this code will only look into "features/" folder for features
	    features={"classpath:features/"},
	    glue = { "com.mycompany.cucumber.stepdefinitions", "com.mycompany.cucumber.hooks" },
	    format = { "com.mycompany.cucumber.formatter.RuntimeInfoCatcher", "json:target/cucumber.json" },
	    tags = { "@working" }
	    format = {
    "pretty",
    "html:target/cucumber-html-report",
    "json-pretty:target/cucumber- report.json"..)*/
public class TestRunner {

}
