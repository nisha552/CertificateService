package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/test/java/FeatureFile_Certificate/sign_in.feature","src/test/java/FeatureFile_Certificate/sign_up.feature"}, 
glue="StepDefinition_Certificate", monochrome=true)
public class TestRunner extends AbstractTestNGCucumberTests{

}
