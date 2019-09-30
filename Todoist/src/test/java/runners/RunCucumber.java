package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
		"pretty"}, features="src/test/resources/feature_files", glue="classpath:step_definition", tags="@register")
public class RunCucumber {

}
