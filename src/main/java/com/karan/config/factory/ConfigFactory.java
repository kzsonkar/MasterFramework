/**
 * 
 */
package com.karan.config.factory;

import org.aeonbits.owner.ConfigCache;

import com.karan.config.FrameworkConfig;

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
