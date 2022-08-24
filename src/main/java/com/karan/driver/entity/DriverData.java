/**
 * 
 */
package com.karan.driver.entity;

import com.karan.enums.BrowserRemoteModeType;
import com.karan.enums.BrowserType;
import com.karan.enums.RunModeBrowserType;

import lombok.Builder;
import lombok.Getter;

/**
 * @author karansonkar
 *
 */

@Builder
@Getter
public final class DriverData {
	
	private BrowserType browserType;
	private BrowserRemoteModeType browserRemoteModeType;
	private RunModeBrowserType runModeBrowserType;

}
