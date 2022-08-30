/**
 * 
 */
package com.karan.driver;

import org.openqa.selenium.WebDriver;

import com.karan.driver.entity.WebDriverData;
import com.karan.driver.web.remote.RemoteDriverFactory;

/**
 * @author karansonkar
 *
 */
public final class RemoteWebDriverImpl implements IWebDriver {

	@Override
	public WebDriver getDriver(WebDriverData driverData) {
		return RemoteDriverFactory.getDriver(driverData.getBrowserRemoteModeType(), driverData.getBrowserType());
	}

}
