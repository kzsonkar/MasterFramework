/**
 * 
 */
package converters;

import java.lang.reflect.Method;

import org.aeonbits.owner.Converter;

import com.karan.enums.RunModeBrowserType;

/**
 * @author karansonkar
 *
 */
public class StringToRunModeBrowserTypeConverter implements Converter<RunModeBrowserType> {

	@Override
	public RunModeBrowserType convert(Method method, String runMode) {
		return RunModeBrowserType.valueOf(runMode.toUpperCase());
	}

}
