package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

    features= {".//FeaturesFile/Emi.feature"},
    glue= {"StepDefinition"},
    plugin= {"pretty","html:reports/myreport.html"}

)
public class Testrunner{
	
}
    
