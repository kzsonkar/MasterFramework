/**
 * 
 */
package com.karan.driver.manager.web.remote.browserstack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.karan.config.factory.BrowserStackConfigFactory;

/**
 * @author karansonkar
 *
 */
public final class BrowserStackFirefoxManager {
	
	private BrowserStackFirefoxManager() {}
	
	public static WebDriver getDriver() {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserName", "firefox");
		caps.setCapability("browser_version", "latest");
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackURL(),caps);
	}
	
}
