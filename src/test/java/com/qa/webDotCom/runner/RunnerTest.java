package com.qa.webDotCom.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature",
				glue="com.qa.webDotCom.stepDef",
				dryRun = true)
public class RunnerTest {

}
