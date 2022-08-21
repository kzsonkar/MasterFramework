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
@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
	"file:${user.dir}/src/test/resources/browser-stack.properties"
})
public interface BrowserStackConfig extends Config{
	
	@Key("userName")
	String userName();
	
	@Key("key")
	String key();
	
	@DefaultValue("https://${userName}:${key}@hub-cloud.browserstack.com/wd/hub")
	@ConverterClass(StringToURLConverter.class)
	URL browserStackURL();

}
