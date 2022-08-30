/**
 * 
 */
package com.karan.config.converters;

import java.lang.reflect.Method;

import org.aeonbits.owner.Converter;

import com.karan.enums.RunModeType;

/**
 * @author karansonkar
 *
 */
public class StringToRunModeBrowserTypeConverter implements Converter<RunModeType> {

	@Override
	public RunModeType convert(Method method, String runMode) {
		return RunModeType.valueOf(runMode.toUpperCase());
	}

}
