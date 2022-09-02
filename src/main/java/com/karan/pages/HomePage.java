/**
 * 
 */
package com.karan.pages;

import com.karan.pages.enums.topmenucomponents.MenuType;
import com.karan.pages.enums.topmenucomponents.SubMenuType;
import com.karan.pages.pagecomponents.homepage.TopMenuComponent;

/**
 * @author karansonkar
 *
 */
public class HomePage {

	private TopMenuComponent topMenuComponent;

	public HomePage() {
		this.topMenuComponent = new TopMenuComponent();
	}

	public TopMenuComponent getTopMenuComponent() {
		return topMenuComponent;
	}
	
	public SystemUserPage navigateToAddUsersPage() {
		topMenuComponent.clickMenuItem(MenuType.ADMIN)
		.clickSubMenuItem(SubMenuType.USER_MANAGEMENT)
		.clickSubMenuItem(SubMenuType.USERS);
		return new SystemUserPage();
	}

}
