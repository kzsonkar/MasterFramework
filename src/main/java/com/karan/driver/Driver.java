/**
 * 
 */
package com.karan.driver;

import org.openqa.selenium.WebDriver;

import com.karan.config.factory.ConfigFactory;
import com.karan.driver.web.local.LocalDriverFactory;

/**
 * @author karansonkar
 *
 */
public class Driver {

	static WebDriver driver = null;

	public static void initDriver() {

		WebDriver driver = LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());
		driver.get("https://google.com/");

	}

	public static void quitDriver() {

	}

}
