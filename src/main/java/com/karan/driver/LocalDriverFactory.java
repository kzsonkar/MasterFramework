package com.karan.driver;

import org.openqa.selenium.WebDriver;

import com.karan.config.ConfigFactory;
import com.karan.driver.manager.ChromeManager;
import com.karan.driver.manager.FirefoxManager;
import com.karan.enums.BrowserType;


public final class LocalDriverFactory {

	static WebDriver driver = null;

	private LocalDriverFactory() {
	}

	public static WebDriver getDriver() {

		if (ConfigFactory.getConfig().browser() == BrowserType.CHROME) {
			driver = ChromeManager.getDriver();
		} else {
			driver = FirefoxManager.getDriver();
		}
		return driver;
	}

}
