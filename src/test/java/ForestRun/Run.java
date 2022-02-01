package ForestRun;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features ="src/test/resources/firstTest.feature",
        glue = {"steps"}
)
public abstract class Run  extends AbstractTestNGCucumberTests {
}
