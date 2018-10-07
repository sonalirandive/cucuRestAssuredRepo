package com.postUpdatedJSON;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/resources/com/sap/features", glue = { "com.sap.postRequests" })
@CucumberOptions(
		
		//dryRun=true,
		//tags={"@Important"}, //All scenario executed if this is tag for feature file
		 //tags={"@Smoke"}, //only tag with @smoke
		tags={"@Smoke"}, //AND condition
		 //tags={"@Smoke,@Regression"} , // OR condiction
		monochrome=true,
		dryRun=false,
		features= {"src/test/resources/com/postUpdatedJSON/"},
		glue={"com/postUpdatedJSON/"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report6.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
		}
	)
public class RunFirstScriptTest {

}
