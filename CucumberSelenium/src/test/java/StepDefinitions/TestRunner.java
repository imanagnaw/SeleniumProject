package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/LoginDemo.feature", glue= {"StepDefinitions"},
monochrome =true,
//plugin = {"pretty", "html:target/HtmlReports"})
plugin = {"json:target/cucumber.json"})
public class TestRunner {

}
