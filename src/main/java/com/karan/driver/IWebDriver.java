/**
 * 
 */
package com.karan.driver;

import org.openqa.selenium.WebDriver;

import com.karan.driver.entity.WebDriverData;

/**
 * @author karansonkar
 *
 */
public interface IWebDriver {
	
	WebDriver getDriver(WebDriverData driverData);

}
