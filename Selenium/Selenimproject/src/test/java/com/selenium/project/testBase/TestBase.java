package com.selenium.project.testBase;

import com.selenium.project.Utilities.reusableComponents.ActionEngine;
import com.selenium.project.Utilities.reusableComponents.PropertiesOperations;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

/**
 * @author: Santosh Chavan

 * @LinkedIn: www.linkedin.com/in/santosh-chavan-5833237b
 */
public class TestBase extends ActionEngine {
	BrowserFactory bf = new BrowserFactory();

	@BeforeMethod
	public void LaunchApplication() throws Exception {
		String browser = PropertiesOperations.getPropertyValueByKey("browser");
		String url = 	PropertiesOperations.getPropertyValueByKey("url");

		DriverFactory.getInstance().setDriver(bf.createBrowserInstance(browser));

		DriverFactory.getInstance().getDriver().manage().window().maximize();
		DriverFactory.getInstance().getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		DriverFactory.getInstance().getDriver().navigate().to(url);

	}

	@AfterMethod
	public void tearDown() {
		DriverFactory.getInstance().closeBrowser();
	}

}
