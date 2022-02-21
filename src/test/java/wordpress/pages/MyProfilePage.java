package wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import wordpress.utilities.Driver;
import wordpress.utilities.Utils;

public class MyProfilePage {
    public MyProfilePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

  Utils utils = new Utils();
  WebDriver driver = Driver.getDriver();

    @FindBy(xpath="(//*[@class='gravatar'])[1]")
    public WebElement myProfile;

   @FindBy(xpath="//span[text() = 'Click to change photo']")
   public WebElement profilePhoto;

    @FindBy(xpath = "//input[@type = 'text'][@id= 'first_name']")
    public WebElement firstName;

   @FindBy(xpath = "//label[text() = 'First name']")
   public WebElement firstNameMessage;

    @FindBy(xpath = "//input[@type = 'text'][@id= 'last_name']")
    public WebElement lastName;

   @FindBy(xpath = "//label[text() = 'Last name']")
   public WebElement lastNameMessage;

    @FindBy(xpath = "//input[@type = 'text'][@id= 'display_name']")
    public WebElement displayName;

    @FindBy(xpath = "//textarea[@id = 'description'][@class= 'form-textarea']")
    public WebElement aboutMe;

    @FindBy(xpath = "//input[@type = 'checkbox']")
    public WebElement hiddenButton;

    @FindBy(xpath = "//button[@type = 'submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//button[@type= 'button'][@class = 'button is-compact']")
    public WebElement addButton;

    @FindBy(xpath = "//button[text() = 'Add WordPress Site']")
    public WebElement addWordPressSite;

    @FindBy(xpath = "//button[text() = 'Add URL']")
    public WebElement addURL;

    @FindBy(xpath = "//span[text() = 'Settings saved successfully!']")
    public WebElement successMessage;

    @FindBy(xpath = "//button[@title= 'Log out of WordPress.com'][text() = 'Log out']")
    public WebElement logOut;


  }