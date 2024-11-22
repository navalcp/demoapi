package cucumber.options;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/failed.txt",
        glue = {"stepdefinations"},
        plugin={"pretty","json:target/jsonreports/cucumber-report.json"},
        monochrome = true)
public class FailedRunner {

}
