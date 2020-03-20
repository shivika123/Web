package com.qa.webDotCom.pages;

import org.openqa.selenium.WebDriver;

import com.qa.webDotCom.objectRepository.LandingPageProp;
import com.qa.webDotCom.util.WebDriverUtils;

public class LandingPage extends WebDriverUtils implements LandingPageProp{
	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	public PackageSelectionPage clickOnGetStarted()
	{
		click(GET_STARTED_LOCATOR);
		return new PackageSelectionPage(driver);
	}

}
