package runner;
import org.junit.runner.RunWith;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {".//Feature/login.feature"},
		glue="stepDefination",
		dryRun = false,
		monochrome = true



)










public class EbayRunner {

}
