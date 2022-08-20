/**
 * 
 */
package com.karan.driver.web.remote;

import org.openqa.selenium.WebDriver;

import com.karan.driver.manager.web.remote.selenium.SeleniumGridChromeManager;
import com.karan.driver.manager.web.remote.selenium.SeleniumGridFirefoxManager;
import com.karan.enums.BrowserType;

/**
 * @author karansonkar
 *
 */
public final class SeleniumGridFactory {
	
	private SeleniumGridFactory() {}
	
	public static WebDriver getDriver(BrowserType browserType) {
		return browserType == BrowserType.CHROME ?
				SeleniumGridChromeManager.getDriver()
				: SeleniumGridFirefoxManager.getDriver();
	}

}
