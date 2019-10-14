package stepDefinitions;

import cucumber.api.java.en.When;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDef_Application_SignUp_DataTable 
  {
    //DadtaTable api is called
	//DataTable.raw() is called
    @When("^User signs up using following details$")
    public void user_signs_up_using_following_details(DataTable data) throws Throwable 
	    {
	        List<List<String>> obj=data.raw();     
	        for(int i=0;i<=2;i++)
	        {
		        for(int j=0;j<=4;j++)
		        	{             
		        	  System.out.println(obj.get(i).get(j));
		        	}  
	        }
	         	        
	    }

    @Then("^User sign up is succesfull$")
    public void user_sign_up_is_succesfull() throws Throwable {
        System.out.println("User sign up is succesfull");
        System.out.println("====================================");
    }

}