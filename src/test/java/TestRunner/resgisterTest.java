package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"allFeatureFile/guru92.feature"},
		glue= {"Step"}
		)

public class resgisterTest {

}
