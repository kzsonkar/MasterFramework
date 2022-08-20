/**
 * 
 */
package com.karan.driver.manager.web.remote.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.karan.config.factory.ConfigFactory;

/**
 * @author karansonkar
 *
 */
public final class SeleniumGridFirefoxManager {
	
	private SeleniumGridFirefoxManager() {}

	public static WebDriver getDriver() {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName(BrowserType.FIREFOX);
		return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridURL(), caps);
	}
	

}
