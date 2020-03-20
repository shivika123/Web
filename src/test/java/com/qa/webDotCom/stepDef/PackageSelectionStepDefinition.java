package com.qa.webDotCom.stepDef;

import io.cucumber.java.en.And;

public class PackageSelectionStepDefinition {
	Steps steps;
	public PackageSelectionStepDefinition(Steps steps) {
		this.steps=steps;
	}
	@And("^user click on add to cart button of desired package$")
	public void click_on_add_to_cart()
	{
		steps.domainselectionpage=steps.packageselectionpage.clickOnAddToCart();
	}

}
