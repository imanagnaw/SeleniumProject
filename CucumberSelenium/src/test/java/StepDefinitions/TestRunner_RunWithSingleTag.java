package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureWithTags",
glue= {"StepDefinitions"},
monochrome =true,
plugin = {"pretty", "html:target/HtmlReports"},
tags = "@smoke or @regression"
)

public class TestRunner_RunWithSingleTag {

}
