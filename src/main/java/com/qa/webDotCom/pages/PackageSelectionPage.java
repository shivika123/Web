package com.qa.webDotCom.pages;

import org.openqa.selenium.WebDriver;

import com.qa.webDotCom.objectRepository.PackageSelectionPageProp;
import com.qa.webDotCom.util.WebDriverUtils;

public class PackageSelectionPage extends WebDriverUtils implements PackageSelectionPageProp {
	WebDriver driver;
	public PackageSelectionPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	public DomainSelectionPage clickOnAddToCart()
	{
		click(Add_To_Cart);
		return new DomainSelectionPage(driver);
	}
}
