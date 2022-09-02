/**
 * 
 */
package com.karan.config;

import java.net.URL;

import org.aeonbits.owner.Config;

import com.karan.config.converters.StringToBrowserTypeConverter;
import com.karan.config.converters.StringToRemoteModeBrowserTypeConverter;
import com.karan.config.converters.StringToRunModeBrowserTypeConverter;
import com.karan.config.converters.StringToURLConverter;
import com.karan.enums.BrowserRemoteModeType;
import com.karan.enums.BrowserType;
import com.karan.enums.RunModeType;

/**
 * @author karansonkar
 *
 */

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
	"system:properties",
	"system:env",
	"file:${user.dir}/src/test/resources/config.properties",
	"file:${user.dir}/src/test/resources/staging-config.properties",
	"file:${user.dir}/src/test/resources/dev-config.properties"
})
public interface FrameworkConfig extends Config {
	
	@DefaultValue("staging")
	String environment();
	
	@Key("${environment}.webUrl")
	String webUrl();
	
	@DefaultValue("CHROME")
	@ConverterClass(StringToBrowserTypeConverter.class)
	BrowserType browser();
	
	@Key("runModeBrowser")
	@ConverterClass(StringToRunModeBrowserTypeConverter.class)
	RunModeType browserRunMode();
	
	@Key("browserRemoteMode")
	@ConverterClass(StringToRemoteModeBrowserTypeConverter.class)
	BrowserRemoteModeType browserRemoteMode();
	
	@Key("seleniumGridURL")
	@ConverterClass(StringToURLConverter.class)
	URL seleniumGridURL();
	
	@Key("selenoidURL")
	@ConverterClass(StringToURLConverter.class)
	URL selenoidURL();

}
