/**
 * 
 */
package com.karan.config.factory;

import org.aeonbits.owner.ConfigCache;

import com.karan.config.BrowserStackConfig;

/**
 * @author karansonkar
 *
 */
public final class BrowserStackConfigFactory {
	
	private BrowserStackConfigFactory() {};
	
	public static BrowserStackConfig getConfig() {
		return ConfigCache.getOrCreate(BrowserStackConfig.class);
	}

}
