package wordpress.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html: target/cucumber-report.html",
        "json:target/cucumber.json",
        "rerun:target/return.txt",},
        features = "src/test/resources/features",
        glue = "wordpress/step_definitions",
        dryRun = false,
        //strict = true,
        tags = "@Regression"
)
public class TestRunner {

}
