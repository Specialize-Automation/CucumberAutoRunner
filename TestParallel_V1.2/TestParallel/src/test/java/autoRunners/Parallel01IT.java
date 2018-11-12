import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"E:/Eclipse_selenium/TestParallel/TestParallel_V1.2/TestParallel/src/test/resources/Files/Bing.feature"},
        plugin = {"json:E:/Eclipse_selenium/TestParallel/TestParallel_V1.2/TestParallel/target/cucumber-parallel/json/1.json"},
        monochrome = true,
        tags = {"@google,@bing"},
        glue = {"stepDefinitions"})
public class Parallel01IT {
}
