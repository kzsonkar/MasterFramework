/**
 * 
 */
package com.karan.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.karan.driver.DriverManager;

/**
 * @author karansonkar
 *
 */
public class PageActionsHelper {
	
	private static WebDriverWait wait;
	
	private PageActionsHelper(){}
	
	public static void waitAndClick(By by) {
		DriverManager.getDriver().findElement(by).click();
	}
	
	public static void waitAndSendKeys(By by, String value) {
		wait = new WebDriverWait(DriverManager.getDriver(),15000);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
		DriverManager.getDriver().findElement(by).sendKeys(value);
	}
	
	public static void select(By by, String option) {
		 List<WebElement> dropDownOptions = DriverManager.getDriver().findElements(by);
		 for(WebElement options: dropDownOptions) {
			 if(options.getText().equalsIgnoreCase(option)) {
				 options.click();
			 }
		 }
	}

}
