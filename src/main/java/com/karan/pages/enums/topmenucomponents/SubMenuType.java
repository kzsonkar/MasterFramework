/**
 * 
 */
package com.karan.pages.enums.topmenucomponents;

/**
 * @author karansonkar
 *
 */
public enum SubMenuType {
	
	USER_MANAGEMENT("User_Managerment"),
	USERS("Users");
	
	private final String name;

	public String getName() {
		return name;
	}

	SubMenuType(String name) {
		this.name = name;
	}

}
