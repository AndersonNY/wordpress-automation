package wordpress.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import wordpress.utilities.ConfigurationReader;
import wordpress.utilities.Driver;

import java.util.concurrent.TimeUnit;

//public class Hooks {
//    Actions actions;
//    WebDriver driver;
//
//    @Before
//    public void setUp(){
//        driver= Driver.getDriver();
//        actions=new Actions(driver);
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get(ConfigurationReader.getProperty("url"));
//    }
//
//    @After
//    public void tearDown() {
//        if(driver !=null){
//            driver.quit();
//            driver=null;
//        }
//
//    }
//}
