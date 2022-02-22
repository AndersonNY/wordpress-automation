package wordpress.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html: target/Reports/HTMLReport/cucumber-report.html",
                "json:target/Reports/JSONReport/cucumber.json",
                "junit:target/Reports/JUNITReport/cucumber.xml",
                "rerun:target/return.txt",},
        features = "src/test/resources/features",
        glue = "wordpress/step_definitions",
        monochrome = true,
        tags = "@Regression"
)
public class TestRunner {

}
