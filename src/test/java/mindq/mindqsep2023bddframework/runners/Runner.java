package mindq.mindqsep2023bddframework.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"Features"},
                                        glue = {"mind.mindqsep2023bddframework.stepdefinitions"},
                                        plugin = {"pretty","html:target/cucumber-reports/cucumberreport.html","json:target/cucumber-reports/cucumberreport1.json"},
                                        tags = "@invalidlogin",
                                        monochrome = true)
public class Runner extends AbstractTestNGCucumberTests{

}
