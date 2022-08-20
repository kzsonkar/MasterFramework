/**
 * 
 */
package com.karan.config.converters;

import java.lang.reflect.Method;
import java.util.Map;

import org.aeonbits.owner.Converter;

import com.karan.enums.BrowserType;

/**
 * @author karansonkar
 *
 */
public class StringToBrowserTypeConverter implements Converter<BrowserType> {

	@Override
	public BrowserType convert(Method method, String browserName) {
		Map<String, BrowserType> stringBrowserTypeMap = Map.of("CHROME", BrowserType.CHROME, "FIREFOX",
				BrowserType.FIREFOX);
		return stringBrowserTypeMap.getOrDefault(browserName, BrowserType.CHROME);
	}

}
