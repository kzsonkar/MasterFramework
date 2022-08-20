/**
 * 
 */
package com.karan.config.converters;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

import org.aeonbits.owner.Converter;

import lombok.SneakyThrows;

/**
 * @author karansonkar
 *
 */
public class StringToURLConverter implements Converter<URL> {
	
	@SneakyThrows
	@Override
	public URL convert(Method method, String stringURL) {
		try {
			return new URL(stringURL);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
