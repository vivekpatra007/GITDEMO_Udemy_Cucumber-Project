package stepDefinitions;

import org.junit.runner.RunWith;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class Hooks{
	
	@Before("@RegressTestwithBackground")
		public void beforevalidation() 
	{
			
		System.out.println("+++++++++++++++++++++++++++++");
		System.out.println("Before hook validation is run");
	}
	
	@After("@RegressTestwithBackground")
	public void afterevalidation() 
{
		
	System.out.println("After hook validation is run");
	System.out.println("##############################");
}
	
}
