package Runner;


import io.cucumber.testng.CucumberOptions;
import tests.TestBase;

@CucumberOptions(features = "src/test/java/Features",
glue={"Steps"},
plugin={"pretty","html:tsrget/cucumber-html-report"})
public class TestRunner extends TestBase {

	
	
}
