/**
 * 
 */
package com.karan.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;

import com.karan.config.factory.ConfigFactory;
import com.karan.driver.entity.WebDriverData;
import com.karan.driver.factory.DriverFactory;

/**
 * @author karansonkar
 *
 */
public class Driver {

	private Driver() {
	}

	public static void initDriverForWeb() {
		if (Objects.isNull(DriverManager.getDriver())) {
			WebDriverData driverData = new WebDriverData(ConfigFactory.getConfig().browser(),
					ConfigFactory.getConfig().browserRemoteMode());
			WebDriver driver = DriverFactory.getDriverForWeb(ConfigFactory.getConfig().browserRunMode())
					.getDriver(driverData);
			DriverManager.setDriver(driver);
		}
	}

	public static void initDriverForMobile() {

	}

	public static void quitDriver() {
		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}

}
