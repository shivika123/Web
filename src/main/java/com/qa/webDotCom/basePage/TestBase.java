package com.qa.webDotCom.basePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.webDotCom.pages.LandingPage;

public class TestBase {
	private WebDriver driver;
	private Properties prop;
	public TestBase()
	{
		prop=new Properties();
		FileInputStream fs;
		try {
			fs = new FileInputStream("C:\\Users\\other user\\shiv\\WebDotCom\\src\\main\\resources\\PropertiesFile\\config.properties");
			prop.load(fs);
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	public WebDriver launch_browser()
	{
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\other user\\Downloads\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:/Users/other user/Downloads/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	public LandingPage enterUrl()
	{
		driver.get(prop.getProperty("url"));
		return new LandingPage(driver);
	}

}
