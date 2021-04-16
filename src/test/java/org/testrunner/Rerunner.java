package org.testrunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.newadactin.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="@src\\test\\resources\\rerun\\failedcase.txt",glue="org.newadactin",dryRun =false,monochrome=true,strict=false,
plugin={"pretty","html:target\\Reports","json:target\\Reports\\Output.json","junit:target\\Reports\\fb.xml","rerun:src\\test\\resources\\rerun\\failedcase.txt"})


public class Rerunner {
	
	@AfterClass
	public static void jvmReportGeneration() {
		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\target\\Reports\\Output.json");
		

	}
}
