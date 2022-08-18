/**
 * 
 */
package com.karan.driver;

import org.openqa.selenium.WebDriver;

/**
 * @author karansonkar
 *
 */
public class Driver {
	
	static WebDriver driver = null;
	
	public static void initDriver() {
		
		WebDriver driver = LocalDriverFactory.getDriver();
		driver.get("https://google.com/");
		
	}
	
	public static void quitDriver() {
		
	}

}
