package com.karan.driver.web.remote;

import org.openqa.selenium.WebDriver;

import com.karan.enums.BrowserRemoteModeType;
import com.karan.enums.BrowserType;

public final class RemoteDriverFactory {

	private RemoteDriverFactory() {
	}

	public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, BrowserType browserType) {
		if (browserRemoteModeType == BrowserRemoteModeType.SELENIUMGRID) {
			return SeleniumGridFactory.getDriver(browserType);
		} else if (browserRemoteModeType == BrowserRemoteModeType.SELENOID) {
			return SelenoidFactory.getDriver(browserType);
		} else if (browserRemoteModeType == BrowserRemoteModeType.BROWSERSTACK) {
			return BrowserStackFactory.getDriver(browserType);
		}
		return null;
	}
}
