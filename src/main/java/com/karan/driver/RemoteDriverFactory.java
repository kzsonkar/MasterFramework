package com.karan.driver;

import org.openqa.selenium.WebDriver;

import com.karan.config.ConfigFactory;
import com.karan.enums.BrowserRemoteModeType;

public final class RemoteDriverFactory {
	
	private RemoteDriverFactory() {}
	
	public static WebDriver getDriver() {
		BrowserRemoteModeType browserRemoteModeType = ConfigFactory.getConfig().browserRemoteMode();
		if(browserRemoteModeType == BrowserRemoteModeType.SELENIUMGRID) {
			
		} else if(browserRemoteModeType == BrowserRemoteModeType.SELENOID) {
			
		} else {
			
		}
		return null;
	}
	

}
