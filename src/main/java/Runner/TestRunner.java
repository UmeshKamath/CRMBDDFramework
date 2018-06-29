package Runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\ukamath\\workspace\\FreeCRMBDDFramwork\\src\\main\\java\\Features\\tagging.feature", //the path of the feature files
		glue={"StepDefinations"},
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //the path of the step definition files
		monochrome = true,
		dryRun = true,
		strict = true
		)


public class TestRunner {

}
