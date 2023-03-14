package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features = {"C:\\Users\\AK\\eclipse-workspace\\Cheap_Air\\src\\test\\java\\com\\feature"}, 
glue = {"com.cheapsnippets" }, monochrome = true, dryRun = false,
plugin = { "html:Reports/htmlreport.html", "rerun:target/rerun.txt",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
public class RunnerCheapAir {

}
