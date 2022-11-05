package runner;

import org.testng.annotations.DataProvider;

//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



//@RunWith(Cucumber.class) //Junit execution

@CucumberOptions(
		plugin = {"pretty", "html:target/vijay123.html"}, //reporting purpose
		monochrome=true,  //console output
		tags = "@feature001 or TS001", //tags from feature file
		features = {"src/test/resources/features"}, //location of feature files
		glue= "stepDefinition") //location of step definition files


public class TestRunner extends AbstractTestNGCucumberTests{
	
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();
    }


}


