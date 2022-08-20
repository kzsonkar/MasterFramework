/**
 * 
 */
package com.karan.driver.web.remote;

import org.openqa.selenium.WebDriver;

import com.karan.driver.manager.web.remote.browserstack.BrowserStackChromeManager;
import com.karan.driver.manager.web.remote.browserstack.BrowserStackFirefoxManager;
import com.karan.enums.BrowserType;

/**
 * @author karansonkar
 *
 */
public final class BrowserStackFactory {

	private BrowserStackFactory() {
	}

	public static WebDriver getDriver(BrowserType browserType) {
		return browserType == BrowserType.CHROME 
				? BrowserStackChromeManager.getDriver()
				: BrowserStackFirefoxManager.getDriver();
	}

}
