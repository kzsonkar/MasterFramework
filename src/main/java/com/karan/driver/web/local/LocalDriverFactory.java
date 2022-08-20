package com.karan.driver.web.local;

import org.openqa.selenium.WebDriver;

import com.karan.driver.manager.web.local.ChromeManager;
import com.karan.driver.manager.web.local.FirefoxManager;
import com.karan.enums.BrowserType;

public final class LocalDriverFactory {

	static WebDriver driver = null;

	private LocalDriverFactory() {
	}

	public static WebDriver getDriver(BrowserType browserType) {
		return isBrowserChrome(browserType) ? ChromeManager.getDriver() : FirefoxManager.getDriver();
	}

	private static boolean isBrowserChrome(BrowserType browserType) {
		return browserType == BrowserType.CHROME;
	}

}
