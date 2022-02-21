package wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import wordpress.utilities.Driver;
import wordpress.utilities.Utils;

public class HomePage {
    Utils utils = new Utils();
    WebDriver driver = Driver.getDriver();

    @FindBy(xpath = "//a[@data-tip-target='my-sites']")
    public WebElement mySitePage;

    @FindBy(xpath = "//a[@data-tip-target='reader']")
    public WebElement readerPage;

    @FindBy(xpath="//a[@title='Create a New Post']")
    public WebElement writeNewPost;

    @FindBy(xpath="//a[@data-tip-target='me']")
    public WebElement myProfile;

    public String getHomePageTitle () {
        Utils.waitForVisibility(readerPage, 5);
        return readerPage.getText();
    }

//    public void navigateTo(String textOfPage){
//        String xpath=String.format("//span[text()='%s']",textOfPage);
//        Utils.waitForVisibility(driver.findElement(By.xpath(xpath)),10);
//        driver.findElement(By.xpath(xpath)).click();
//
//    }
    public HomePage(){PageFactory.initElements(driver, this);}
}
