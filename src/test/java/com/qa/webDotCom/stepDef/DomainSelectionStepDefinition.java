package com.qa.webDotCom.stepDef;

import io.cucumber.java.en.And;

public class DomainSelectionStepDefinition {
	Steps steps;
	public DomainSelectionStepDefinition(Steps steps)
	{
		this.steps=steps;
	}
	@And("user enter the domain name which you want to register {string}")
	public void enter_domain_name(String domainname)
	{
		steps.domainselectionpage.enterDomainName(domainname);
	}
	

}
