/**
 * 
 */
package com.karan.pages.enums.topmenucomponents;

/**
 * @author karansonkar
 *
 */
public enum SubMenuType {
	
	USER_MANAGEMENT("User Management "),
	USERS("Users"),
	ADD(" Add ");
	
	private final String name;

	public String getName() {
		return name;
	}

	SubMenuType(String name) {
		this.name = name;
	}

}
