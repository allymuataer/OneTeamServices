package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", 
				"html:test-output/Task2-report.html",
		"json:target/cucumber.json"},
		features="src/test/resources/features/BookStore.feature",
		glue = "stepDefinition",
		dryRun=false)

public class CukesRunner {
	
}
