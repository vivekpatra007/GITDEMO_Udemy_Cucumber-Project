package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(		
		features="src/test/java/features/AdditionalAttributes.feature",
		glue="stepDefinitions",
		tags="@RegressionTest",
		//dryRun=true,
		monochrome=true,
		strict=true		 
)


public class TS_ExecuControl_Tagging_AdditionalAttributest_TestRunner {

}
