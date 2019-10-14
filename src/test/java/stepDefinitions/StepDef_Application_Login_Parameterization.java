package stepDefinitions;

import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDef_Application_Login_Parameterization {

    @When("^User logins into app with (.+) and (.+)$")
    public void user_logins_into_app_with_and(String username, String password) throws Throwable 
    {
    	System.out.println("User logged in with "+"username "+username+" and "+"password "+ password);
    }

}