package runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features=".\\src\\test\\java\\featureFiles\\Login.feature",
		glue="stepDefinition",
		dryRun=true//true-for the feature file step definition methods will be generated
		           //false-browser will be launched and execution will take place
		)
public class RunnerIO extends AbstractTestNGCucumberTests{

}
