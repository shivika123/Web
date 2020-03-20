package com.qa.webDotCom.objectRepository;

import org.openqa.selenium.By;

public interface PackageSelectionPageProp {
	By Add_To_Cart=By.xpath("//div//child::h2[contains(text(),'$15')]//following-sibling::button//child::a[@class='pricing__addToCartWebsite']");
}
