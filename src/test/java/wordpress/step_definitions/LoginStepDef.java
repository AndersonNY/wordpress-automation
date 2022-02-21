package wordpress.step_definitions;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import wordpress.pages.LoginPage;

import java.util.List;
import java.util.Map;

public class LoginStepDef extends Hooks {

    LoginPage loginPage=new LoginPage();

    @Given("User landing to the application")
    public void user_landing_to_the_application() {
        loginPage.openLandingPage();
    }

    @When("User enter valid username and password for login")
    public void user_enter_valid_username_and_password_for_login(DataTable dataTable) {
         List<Map<String,String>> rows=dataTable.asMaps(String.class,String.class);
       loginPage.doLogin(rows.get(0).get("userName"),rows.get(0).get("password"));
    }

    @Then("Verify user able to loging successfully")
    public void verify_user_able_to_loging_successfully() {
        Assert.assertEquals("My Site",loginPage.getHomePageTitle());
    }


    @Then("Verify user not able to login")
    public void verifyUserNotAbleToLogin() {
        Assert.assertTrue(loginPage.getIncorrectPasswordMessage().contains("not the right password"));
    }
}

