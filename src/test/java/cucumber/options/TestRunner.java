package cucumber.options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepdefinations"},
        plugin={"pretty","json:target/jsonreports/cucumber-report.json", "rerun:target/failed.txt"},
        monochrome = true)
public class TestRunner {


}
