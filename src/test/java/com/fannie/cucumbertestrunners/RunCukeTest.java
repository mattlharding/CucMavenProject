package com.fannie.cucumbertestrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/com/fannie/features",
        glue = "com.fannie.step_definitions"
               )

public class RunCukeTest {	

}