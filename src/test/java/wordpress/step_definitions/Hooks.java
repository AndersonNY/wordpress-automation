package wordpress.step_definitions;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import wordpress.utilities.ConfigurationReader;
import wordpress.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
        //System.out.println("Set up browser");
        Actions actions;
        WebDriverWait wait;
        WebDriver driver = Driver.getDriver();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
        driver.get(ConfigurationReader.getProperty("url"));
    }

    @After
    public void closeScenario(Scenario scenario) throws InterruptedException {


        if(scenario.isFailed()) {
            //take screenshot using Selenium
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png", scenario.getName());
        }

        System.out.println("close driver");
        Driver.closeDriver();
    }
}
