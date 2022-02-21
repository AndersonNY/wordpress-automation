package wordpress.step_definitions;

import io.cucumber.core.gherkin.ScenarioOutline;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import wordpress.pages.LoginPage;
import wordpress.pages.MyProfilePage;
import wordpress.utilities.Driver;

public class MyProfileStepDef{
    MyProfilePage myProfilePage= new MyProfilePage();
    LoginPage loginPage = new LoginPage();
    String myprofile = "https://wordpress.com/me";


    @When("User navigates to MyProfile page")
    public void user_navigates_to_MyProfile_page() {
        System.out.println("My Profile page displays.");
        Driver.getDriver().get(myprofile);

    }

    @Then("Settings of personal information should be displayed")
    public void settings_of_personal_information_should_be_displayed() {
        System.out.println("First Name and Last Name boxes appear.");
        String firstName = myProfilePage.firstNameMessage.getText();
        Assert.assertTrue(myProfilePage.firstNameMessage.isDisplayed());
        System.out.println(firstName);

        String lastName = myProfilePage.lastNameMessage.getText();
        Assert.assertTrue(myProfilePage.lastNameMessage.isDisplayed());
        System.out.println(lastName);
    }

    @When("User changes First Name and Last Name")
    public void user_changes_First_Name_and_Last_Name() {
        System.out.println("Enter First Name and Last Name");
        myProfilePage.firstName.sendKeys("Orhan");
        myProfilePage.lastName.sendKeys("Akkurt");

        myProfilePage.firstName.clear();
        myProfilePage.lastName.clear();
    }
    @When("User writes brief bio in About Me box")
    public void user_writes_brief_bio_in_About_Me_box() {
        System.out.println("Please Enter some information about you.");

        myProfilePage.aboutMe.sendKeys("Orhan Akkurt is QA Engineer with a 6 year of experience. He knows Java, Selenium, Cucumber, API.");
    }
    @When("User updates Hide My Gavatar Profile page")
    public void user_updates_Hide_My_Gavatar_Profile_page() {
     myProfilePage.hiddenButton.click();
    }
    @When("User clicks save button")
    public void user_clicks_save_button() {
       myProfilePage.saveButton.click();
    }

    @Then("First Name and Last Name should be displayed")
    public void first_Name_and_Last_Name_should_be_displayed() {
        System.out.println("First name and last name are displayed.");


    }

    @Then("User logs out of Word Press")
    public void user_logs_out_of_WordPress() {
        myProfilePage.logOut.click();
    }
}
