package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfig;
	
	//Here we are inside TestRunner Class which runs on top of JUnit using the cucumber options such as follows: 
    //we will use cucumber options to setup our TestRunner class
	//feature : we can add the path to our feature files here
	//glue : we add the path to our stepDefinitions where (we are gluing features to steps)
	//tags : by adding the tags we will specify which feature(s), scenario(s) or scenario outline should be executed
	//dryRun : if set to true, it will check and make sure we have stepDefinition methods for each step in feature file
			//if set to false, it will execute the test case for us
	//strict : will mark our scenarios as failed if there is no stepDefinition methods available.
    //monochrome : will help us to print the stepDefinition methods in clean format in the console so that we can use it 
	//in our stepDefinition class
	//plugin : we can add plugin(s) here to generate reports
	@RunWith(Cucumber.class)
	@CucumberOptions(
	features = "classpath:features",
	glue = "stepDefinitions",
	tags = "@loginToTestEnv",
	dryRun = false,
	strict = true,
	monochrome = true,
	plugin = {
			"pretty",
			"html:target/site/cucumber-pretty",
			"json:target/cucumber.json"
	},
	publish = true
	)
	
public class TestRunner {
		@AfterClass
		public static void generateReport() { //This method is going to generate the cucumber report for us inside "cucumber-html-reports" folder, located
			                                  //inside "target" folder of our current project. 
			CucumberReportingConfig.reportConfig();
		}
		
}