/**
 * 
 */
package com.karan.driver.entity;

import com.karan.enums.BrowserRemoteModeType;
import com.karan.enums.BrowserType;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author karansonkar
 *
 */
@AllArgsConstructor
@Getter
public final class WebDriverData {
	
	private BrowserType browserType;
	private BrowserRemoteModeType browserRemoteModeType;

}
