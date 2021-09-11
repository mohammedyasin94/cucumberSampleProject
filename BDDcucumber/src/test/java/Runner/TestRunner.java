package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//features/createAnOrder.feature",
					glue="stepDefinations",
					dryRun= false,
					plugin = { "pretty", "html:target/cucumber-reports" },
					monochrome = true)
public class TestRunner {

}
