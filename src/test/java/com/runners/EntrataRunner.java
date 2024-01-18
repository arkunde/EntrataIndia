package com.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Feature\\Entrata.feature" , glue={"Step_Defenation"}
,tags="@EntrataIndia"
//,tags="@tag1 or @tag2 or @tag3 or @tag4 or @tag5"
,plugin={"pretty",
        "html:target/Cucumber-report.html",
        "junit:target/JUNITReports/log.xml",
        "json:target/JSONReports/log.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

//public class EntrataRunner{
//	
//}
public class EntrataRunner extends AbstractTestNGCucumberTests{


}
