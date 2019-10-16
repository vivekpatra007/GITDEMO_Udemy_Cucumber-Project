package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(		
		features="src/test/java/features/Application_SignUp_DataTable.feature",
		glue="stepDefinitions"		
)


public class Application_SignUp_DataTable_TestRunner {

}
