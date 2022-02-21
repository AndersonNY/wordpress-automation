package wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import wordpress.utilities.ConfigurationReader;
import wordpress.utilities.Driver;
import wordpress.utilities.Utils;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);}

        Utils utils = new Utils();
        WebDriver driver = Driver.getDriver();


        @FindBy(xpath = "//*[@id='usernameOrEmail']")
        public WebElement usernameInput;

        @FindBy(xpath = "//*[@id='password']")
        public WebElement passwordInput;


        @FindBy(xpath = "//*[@class='button form-button is-primary']")
        public WebElement continueButton;

        @FindBy(xpath = "//*[@class='login__form-action']")
        public WebElement loginButton;

        @FindBy(xpath = "//span[text()='My Site']")
        public WebElement homePageTitle;

        @FindBy(xpath = "//*[contains(@class,'validation is-error')]")
        public WebElement incorrectPasswordMessage;


        public void doLogin (String userName, String password){
            usernameInput.sendKeys(userName);
            continueButton.click();
            Utils.waitForVisibility(passwordInput, 4);
            passwordInput.sendKeys(password);
            loginButton.click();
        }

        public String getHomePageTitle () {
            Utils.waitForVisibility(homePageTitle, 5);
            return homePageTitle.getText();
        }

        public String getIncorrectPasswordMessage () {
            Utils.waitForVisibility(incorrectPasswordMessage, 4);
            return incorrectPasswordMessage.getText();
        }

        public void openLandingPage () {
            driver.get(ConfigurationReader.getProperty("url"));
        }

    }


