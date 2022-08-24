/**
 * 
 */
package com.karan.driver.factory;

import org.openqa.selenium.WebDriver;

import com.karan.driver.entity.DriverData;
import com.karan.driver.web.local.LocalDriverFactory;
import com.karan.driver.web.remote.RemoteDriverFactory;
import com.karan.enums.RunModeBrowserType;

/**
 * @author karansonkar
 *
 */
public final class DriverFactory {

	/**
	 * 
	 */
	private DriverFactory() {
		// TODO Auto-generated constructor stub
	}

	public static WebDriver getDriverForWeb(DriverData driverData) {
		if (driverData.getRunModeBrowserType() == RunModeBrowserType.LOCAL) {
			return LocalDriverFactory.getDriver(driverData.getBrowserType());
		} else {
			return RemoteDriverFactory.getDriver(driverData.getBrowserRemoteModeType(), driverData.getBrowserType());
		}
	}
	
	public static WebDriver getDriverForMobile(DriverData driverData) {
		return null;
	}

}
