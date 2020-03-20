package com.qa.webDotCom.stepDef;

import io.cucumber.java.en.And;

public class LandingPageStepDefinition {
	Steps steps;
	public LandingPageStepDefinition(Steps steps) {
		this.steps=steps;
	}
	@And("^user click on get started button$")
	public void user_click_on_get_started_button() {
		steps.packageselectionpage=steps.landingpage.clickOnGetStarted();
	}

}
