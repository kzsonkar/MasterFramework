/**
 * 
 */
package com.karan.config;

import java.net.URL;

import org.aeonbits.owner.Config;

import com.karan.config.converters.StringToURLConverter;

/**
 * @author karansonkar
 *
 */
public interface BrowserStackConfig extends Config{
	
	@Key("username")
	String userName();
	
	@Key("key")
	String key();
	
	@DefaultValue("https://${userName}:$key@hub-cloud.browserstack.com/wd/hub")
	@ConverterClass(StringToURLConverter.class)
	URL browserStackURL();

}
