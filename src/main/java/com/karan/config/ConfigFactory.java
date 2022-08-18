/**
 * 
 */
package com.karan.config;

import org.aeonbits.owner.ConfigCache;

/**
 * @author karansonkar
 *
 */
public final class ConfigFactory {
	
	private ConfigFactory() {};
	
	public static FrameworkConfig getConfig() {
		return ConfigCache.getOrCreate(FrameworkConfig.class);
	}

}
