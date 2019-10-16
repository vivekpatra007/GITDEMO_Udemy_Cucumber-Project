package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(		
		features="src/test/java/features",
		glue="stepDefinitions",
		tags="@RegressTestwithBackground",
		plugin={"pretty","html:target/Cucumber HTML Reports",
				         "json:target/Cucumber JSON Reports/cukes.json",
				         "junit:target/Cucumber JUNIT Reports/cukes.xml"}
)


public class TS_ExecuControl_Tagging_ReportsCreation_TestRunner {

}
