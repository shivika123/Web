package com.qa.webDotCom.pages;

import org.openqa.selenium.WebDriver;

import com.qa.webDotCom.objectRepository.DomainSelectionPageProp;
import com.qa.webDotCom.util.WebDriverUtils;

public class DomainSelectionPage extends WebDriverUtils implements DomainSelectionPageProp{
	WebDriver driver;
	public DomainSelectionPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	public void enterDomainName(String domainname)
	{
		enterText(Domain_Search,domainname);
	}
}
