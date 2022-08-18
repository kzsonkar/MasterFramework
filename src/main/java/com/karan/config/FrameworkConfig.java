/**
 * 
 */
package com.karan.config;

import org.aeonbits.owner.Config;

import com.karan.enums.BrowserRemoteModeType;
import com.karan.enums.BrowserType;
import com.karan.enums.RunModeBrowserType;

import converters.StringToBrowserTypeConverter;

/**
 * @author karansonkar
 *
 */

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
	"system:properties",
	"system:env",
	"file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config {
	
	@DefaultValue("CHROME")
	@ConverterClass(StringToBrowserTypeConverter.class)
	BrowserType browser();
	
	@Key("runModeBrowser")
	RunModeBrowserType browserRunMode();
	
	@Key("browserRemoteMode")
	BrowserRemoteModeType browserRemoteMode();

}
