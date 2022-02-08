package md.automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features ="src/test/resources/features/firstTest.feature",
        glue = {"md/automation/steps_definitions"}
)
public abstract class Run  extends AbstractTestNGCucumberTests {
}
