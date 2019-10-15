package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class Background {

    @Given("^Backkgound details are available$")
    public void backkgound_details_are_available() throws Throwable {
    	System.out.println("Updated by Vivek from India");
    	System.out.println("Updated1 by Vivek from India");
    	System.out.println("Updated2 by Vivek from India");
    }

    @When("^User uses the Backkgound details$")
    public void user_uses_the_backkgound_details() throws Throwable {
     
    }

    @Then("^Background is executed$")
    public void background_is_executed() throws Throwable {
        
    	System.out.println("BACKGROUND IS EXECUTED");
    }

}