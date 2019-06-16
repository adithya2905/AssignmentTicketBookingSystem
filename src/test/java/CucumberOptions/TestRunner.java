package CucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Featurefiles/LondonTheaterTicketBooking.feature",
		glue="StepDefnitions" ,
		plugin = {"pretty", "html:target/cucumber-html-report1"})
		//tags = "@SmokeTest,@RegressionTest")
public class TestRunner {

}
