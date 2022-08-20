/**
 * 
 */
package com.karan.driver.manager.web.local;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author karansonkar
 *
 */
public final class FirefoxManager {
	
	private FirefoxManager() {}
	
	public static WebDriver getDriver() {
		WebDriverManager.firefoxdriver().setup();
		return new FirefoxDriver();
	}

}
