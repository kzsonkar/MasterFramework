package com.karan.driver.web.remote;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;

import com.karan.enums.BrowserRemoteModeType;
import com.karan.enums.BrowserType;

public final class RemoteDriverFactory {

	private RemoteDriverFactory() {
	}

	private static final Map<BrowserRemoteModeType, Function<BrowserType, WebDriver>> MAP = new EnumMap<>(
			BrowserRemoteModeType.class);

	static {
		MAP.put(BrowserRemoteModeType.SELENIUMGRID, SeleniumGridFactory::getDriver);
		MAP.put(BrowserRemoteModeType.SELENOID, SelenoidFactory::getDriver);
		MAP.put(BrowserRemoteModeType.BROWSERSTACK, BrowserStackFactory::getDriver);
	}

	public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, BrowserType browserType) {
		return MAP.get(browserRemoteModeType).apply(browserType);
	}
}
