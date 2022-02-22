package wordpress.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import wordpress.utilities.Driver;
import java.util.concurrent.TimeUnit;

public class Hooks {
    WebDriver driver;

    @Before
    public void setUp(){
        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
            Driver.closeDriver();

    }
}
