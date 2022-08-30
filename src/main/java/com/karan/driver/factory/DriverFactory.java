/**
 * 
 */
package com.karan.driver.factory;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;

import com.karan.driver.IWebDriver;
import com.karan.driver.LocalWebDriverImpl;
import com.karan.driver.RemoteWebDriverImpl;
import com.karan.enums.RunModeType;

/**
 * @author karansonkar
 *
 */
public final class DriverFactory {

	/**
	 * 
	 */
	private DriverFactory() {
	}

	private static final Map<RunModeType, Supplier<IWebDriver>> WEB = new EnumMap<>(RunModeType.class);
	
	static {
		WEB.put(RunModeType.LOCAL, ()-> new LocalWebDriverImpl());
		WEB.put(RunModeType.REMOTE, ()-> new RemoteWebDriverImpl());
	}
	
	public static IWebDriver getDriverForWeb(RunModeType runModeType) {
		return WEB.get(runModeType).get();
	}

	public static WebDriver getDriverForMobile(RunModeType runModeType) {
		return null;
	}

}
