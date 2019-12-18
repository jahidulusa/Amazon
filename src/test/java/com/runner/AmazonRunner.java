package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;




@CucumberOptions(
		plugin= {"pretty","html:target/cucumber", "json:target/cucumber.json"},
		
		
		features= {"src/main/resources/Amazon.feature"},
		glue= {"com.stepdef"},
				
		tags= {"@smoke210"},
		
			monochrome=true,
				strict=true
				//dryRun=true
		)








public class AmazonRunner extends AbstractTestNGCucumberTests {

}
