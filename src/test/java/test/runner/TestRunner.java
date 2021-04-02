package test.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import base.clas.JvmReport;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\adactinTags.feature",glue= {"step.defination"},dryRun=false,
monochrome=true,plugin= {"pretty","html:D:\\photon eclipse\\CucumberDayTags\\src\\test\\resources\\report"
		,"json:\\src\\test\\resources\\jsonreport\\repo.json"
})
public class TestRunner {
	
	@AfterClass
	public static void endReport() {
		JvmReport.generateReport(System.getProperty("user.dir") +"\\src\\test\\resources\\jsonreport\\repo.json");
		
		
		
		
	}
	
	

}
