package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(		
		features="src/test/java/features/Application_Login_RegExp.feature",
		glue="stepDefinitions"		
)


public class Application_Login_RegExp_TestRunner {

}
