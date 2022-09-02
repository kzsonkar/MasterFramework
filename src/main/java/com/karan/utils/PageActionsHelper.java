/**
 * 
 */
package com.karan.utils;

import org.openqa.selenium.By;

import com.karan.driver.DriverManager;

/**
 * @author karansonkar
 *
 */
public class PageActionsHelper {
	
	private PageActionsHelper(){}
	
	public static void waitAndClick(By by) {
		DriverManager.getDriver().findElement(by).click();
	}
	
	public static void waitAndSendKeys(By by, String value) {
		DriverManager.getDriver().findElement(by).sendKeys(value);
	}

}
