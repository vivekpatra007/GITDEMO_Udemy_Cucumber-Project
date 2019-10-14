package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDef_AdditionalAttributes {

    @Given("^User lands on the app login page$")
    public void user_lands_on_the_app_login_page() throws Throwable {
    	System.out.println("User lands on the app login page");
    }

    @When("^User logins app using username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_logins_app_using_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println("User logins app with_"+"username "+strArg1+" and "+"password "+ strArg2);
    }

    @Then("^Application Homepage is displayed$")
    public void application_homepage_is_displayed() throws Throwable {
    	System.out.println("Homepage is displayed");   	
    }

    @And("^User profile name button should be displayed$")
    public void user_profile_name_button_should_be_displayed() throws Throwable {
    	System.out.println("User profile name button should be displayed");
    	System.out.println("=============================================="); 
    }

}