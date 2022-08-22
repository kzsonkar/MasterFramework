/**
 * 
 */
package com.karan.driver;

import org.openqa.selenium.WebDriver;

import com.karan.config.factory.ConfigFactory;
import com.karan.driver.web.remote.RemoteDriverFactory;

/**
 * @author karansonkar
 *
 */
public class Driver {

	static WebDriver driver = null;

	private Driver() {
	}

	public static void initDriver() {
		driver = RemoteDriverFactory.getDriver(ConfigFactory.getConfig().browserRemoteMode(), ConfigFactory.getConfig().browser());
	}

	public static void quitDriver() {
		driver.quit();
	}

}
