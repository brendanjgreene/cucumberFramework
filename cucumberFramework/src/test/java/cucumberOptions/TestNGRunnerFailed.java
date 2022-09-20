package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="@target/failed_scenarios.txt",
		glue ="stepDefinitions",
//		dryRun=true,
//		tags ="@PlaceOrder or @OffersPage",
		monochrome=true,
		plugin= {
				"pretty","html:target/cucumber.html",
				"json:target/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/failed_scenarios.txt"
				}
		)
public class TestNGRunnerFailed extends AbstractTestNGCucumberTests{
	boolean runParallel;
	TestNGRunnerFailed(){
		
		
	}
	
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}
