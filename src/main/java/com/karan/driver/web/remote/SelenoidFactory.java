/**
 * 
 */
package com.karan.driver.web.remote;

import org.openqa.selenium.WebDriver;

import com.karan.driver.managerweb.remote.selenoid.SelenoidChromeManager;
import com.karan.driver.managerweb.remote.selenoid.SelenoidFirefoxManager;
import com.karan.enums.BrowserType;

/**
 * @author karansonkar
 *
 */
public final class SelenoidFactory {

	private SelenoidFactory() {
	}

	public static WebDriver getDriver(BrowserType browserType) {
		return browserType == BrowserType.CHROME 
				? SelenoidChromeManager.getDriver()
				: SelenoidFirefoxManager.getDriver();
	}

}
