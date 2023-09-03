package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", 
				"html:test-output/ourServices-report.html",
		"json:target/cucumber.json"},
		features="src/test/resources/features/OurServices.feature",
		glue = "stepDefinition",
		dryRun=false)

public class CukesRunner {
	
}
