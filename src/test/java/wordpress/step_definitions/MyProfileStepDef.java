package wordpress.step_definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import wordpress.pages.HomePage;
import wordpress.pages.LoginPage;
import wordpress.pages.MyProfilePage;
import wordpress.utilities.ConfigurationReader;
import wordpress.utilities.Driver;
import wordpress.utilities.Utils;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class MyProfileStepDef {
    HomePage homePage=new HomePage();
    MyProfilePage myProfilePage= new MyProfilePage();
    LoginPage loginPage = new LoginPage();
    Utils utils=new Utils();
    WebDriver driver;


    @When("User navigates to My Profile page")
    public void user_navigates_to_MyProfile_page() {
        homePage.myProfile.click();
    }


    @Then("User changes First and Last Name to")
    public void user_changes_First_Name_and_Last_Name(DataTable dataTable) {
        List<Map<String,String>> rows=dataTable.asMaps(String.class,String.class);
        myProfilePage.firstName.clear();
        myProfilePage.firstName.sendKeys(rows.get(0).get("FirstName"));
        myProfilePage.lastName.clear();
        myProfilePage.lastName.sendKeys(rows.get(0).get("LastName"));
    }
    @When("User writes brief bio in About Me box")
    public void user_writes_brief_bio_in_About_Me_box(DataTable dataTable) {
        List<Map<String,String>> rows=dataTable.asMaps(String.class,String.class);
        myProfilePage.aboutMe.clear();
        myProfilePage.aboutMe.sendKeys(rows.get(0).get("About Me"));
    }
    @When("^User updates Hide My Gavatar Profile page$")
    public void user_updates_Hide_My_Gavatar_Profile_page() {
     myProfilePage.hiddenButton.click();
    }
    @When("User clicks save button")
    public void user_clicks_save_button() {
       myProfilePage.saveButton.click();
    }

    @Then("^First Name and Last Name should be displayed$")
    public void first_Name_and_Last_Name_should_be_displayed() {
        System.out.println("First name and last name are displayed.");
    }

    @Then("^User logs out of Word Press$")
    public void user_logs_out_of_WordPress() {
        utils.waitFor(5);
        myProfilePage.logOut.click();
    }

    @And("User provide public display name as {string}")
    public void userProvidePublicDisplayNameAs(String publicDisplayName) {
     myProfilePage.displayName.clear();
     myProfilePage.displayName.sendKeys(publicDisplayName);
    }

    @Then("User is able to verify following sections are displayed on side panel")
    public void userIsAbleToVerifyFollowingSectionsAreDisplayedOnSidePanel(DataTable dataTable) {
        List<String> rows=dataTable.asList();
        System.out.println("List from feature file: "+rows);
        System.out.println("List from my profile page: "+myProfilePage.getSideMenuSections());
        Assert.assertTrue(rows.equals(myProfilePage.getSideMenuSections()));

    }

    @Then("User verifies First and Last Name should be")
    public void userVerifiesFirstAndLastNameShouldBe(DataTable dataTable) {
        List<Map<String,String>> rows=dataTable.asMaps(String.class,String.class);
        Assert.assertEquals(rows.get(0).get("FirstName"),myProfilePage.firstName.getText());
        Assert.assertEquals(rows.get(0).get("LastName"),myProfilePage.lastName.getText());

    }

    @And("User verifies public display name as {string}")
    public void userVerifiesPublicDisplayNameAs(String displayName) {
        Assert.assertEquals(displayName,myProfilePage.displayName.getText());
    }

    @And("User verifies brief bio in About Me box")
    public void userVerifiesBriefBioInAboutMeBox(DataTable dataTable) {
        List<Map<String,String>> rows=dataTable.asMaps(String.class,String.class);
        Assert.assertEquals(rows.get(0).get("About Me"),myProfilePage.aboutMe.getText());
    }

    @Then("Verify if user is able to click on Add button")
    public void verifyIfUserIsAbleToClickOnAddButton() {
        Assert.assertTrue(myProfilePage.addButton.isEnabled());
        myProfilePage.addButton.click();
        utils.waitFor(5);
    }

    @And("Verify if user is able to click on Add URL button")
    public void verifyIfUserIsAbleToClickOnAddURLButton() {
        Assert.assertTrue(myProfilePage.addURL.isEnabled());
    }

    @And("Verify if user is able to click on Add WordPress Site")
    public void verifyIfUserIsAbleToClickOnAddWordPressSite() {
        Assert.assertTrue(myProfilePage.addWordPressSite.isEnabled());
    }
    @Before
    public void setUp(){
        driver= Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(ConfigurationReader.getProperty("url"));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
