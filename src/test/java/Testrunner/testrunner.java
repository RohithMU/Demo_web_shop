package Testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features ="src/test/resources/Features",
    glue = {"Stepdefination"}, monochrome=true, 
    plugin={"pretty","html:target/HtmlReports/Testcase.html"},
    tags= "@Regression or @Smoke"
)
public class testrunner 
{
	
}

