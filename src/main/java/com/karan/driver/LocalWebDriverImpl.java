/**
 * 
 */
package com.karan.driver;

import org.openqa.selenium.WebDriver;

import com.karan.driver.entity.WebDriverData;
import com.karan.driver.web.local.LocalDriverFactory;

/**
 * @author karansonkar
 *
 */
public final class LocalWebDriverImpl implements IWebDriver {

	@Override
	public WebDriver getDriver(WebDriverData driverData) {
		return LocalDriverFactory.getDriver(driverData.getBrowserType());
	}

}
