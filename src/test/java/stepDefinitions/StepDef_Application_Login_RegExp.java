package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDef_Application_Login_RegExp {

    @Given("^User is on the app login page$")
    public void user_is_on_the_app_login_page() throws Throwable 
    {
      System.out.println("User is on the app login page");
    }

    @When("^User logins into  app with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_logins_into_app_with_username_something_and_password_something(String strArg1, String strArg2)throws Throwable 
    {
    	System.out.println("User logged in with_"+"username "+strArg1+" and "+"password "+ strArg2);
    }

    @Then("^App Homepage is displayed$")
    public void app_homepage_is_displayed() throws Throwable 
    {
    	System.out.println("App Homepage is displayed");   	
    }

    @And("^User profile name button is displayed$")
    public void user_profile_name_button_is_displayed() throws Throwable 
    {
    	System.out.println("User profile name button is displayed");
    	System.out.println("=============================================="); 
    }
    
    @And("^User Photo is displayed$")
    public void user_Photo_is_displayed() throws Throwable 
    {
    	System.out.println("User Photo is displayed");
    	System.out.println("=============================================="); 
    }

}