/**
 * 
 */
package com.karan.driver;

import org.openqa.selenium.WebDriver;

import com.karan.config.factory.ConfigFactory;
import com.karan.driver.entity.DriverData;
import com.karan.driver.factory.DriverFactory;

/**
 * @author karansonkar
 *
 */
public class Driver {

	static WebDriver driver = null;

	private Driver() {
	}

	public static void initDriverForWeb() {
		DriverData driverData = DriverData.builder()
			.browserType(ConfigFactory.getConfig().browser())
			.browserRemoteModeType(ConfigFactory.getConfig().browserRemoteMode())
			.runModeBrowserType(ConfigFactory.getConfig().browserRunMode()).build();
		driver = DriverFactory.getDriverForWeb(driverData);
	}
	
	public static void initDriverForMobile() {

	}

	public static void quitDriver() {
		driver.quit();
	}

}
