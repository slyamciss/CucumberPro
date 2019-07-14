package com.test.cucumber.runners;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		        features = "src/FeaturesFiles/Login.feature", 
                glue = {"com.test.stepdefinitions" },
		        tags = {"@smoke"},
		        format = {"pretty","html:target/Destination"}
                 )
public class SampleRunner {

}
