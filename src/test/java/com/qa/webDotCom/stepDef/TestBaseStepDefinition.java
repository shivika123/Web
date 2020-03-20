package com.qa.webDotCom.stepDef;

import com.qa.webDotCom.basePage.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TestBaseStepDefinition {
	Steps steps;
	public TestBaseStepDefinition(Steps steps)
	{
		this.steps=steps;
	}
	@Given("^user launch browser$")
	public void user_launch_browser()
	{
		steps.testbase=new TestBase();
		steps.testbase.launch_browser();
	}
	@When("^user enter url$")
	public void user_enter_url()
	{
		steps.landingpage=steps.testbase.enterUrl();
	}

}
