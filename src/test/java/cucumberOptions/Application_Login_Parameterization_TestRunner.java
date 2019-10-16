package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(		
		features="src/test/java/features/Application_Login_Parameterization.feature",
		glue="stepDefinitions"		
)


public class Application_Login_Parameterization_TestRunner {

}
