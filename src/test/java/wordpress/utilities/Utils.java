package wordpress.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

    public static WebElement waitForVisibility(WebElement element, int timeToWaitInsec){

        WebDriverWait wait =new WebDriverWait(Driver.getDriver(), timeToWaitInsec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

}
