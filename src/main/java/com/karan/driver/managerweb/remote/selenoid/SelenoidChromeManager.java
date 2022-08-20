/**
 * 
 */
package com.karan.driver.managerweb.remote.selenoid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.karan.config.factory.ConfigFactory;

/**
 * @author karansonkar
 *
 */
public final class SelenoidChromeManager {
	
	private SelenoidChromeManager() {}
	
	public static WebDriver getDriver() {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserName", "chrome");
		caps.setCapability("browserVersion", "97.0");
		caps.setCapability("enableVNC", true);
		caps.setCapability("enableVideo", false);
		return new RemoteWebDriver(ConfigFactory.getConfig().selenoidURL(),caps);
	}

}
