/**
 * 
 */
package com.karan.pages.pagecomponents.homepage;

import org.openqa.selenium.By;

import com.karan.pages.enums.topmenucomponents.MenuType;
import com.karan.pages.enums.topmenucomponents.SubMenuType;
import com.karan.utils.PageActionsHelper;

/**
 * @author karansonkar
 *
 */
public class TopMenuComponent {
	
	private static final String MENU = "//b[text()='%s']/parent::a";
	private static final String SUB_MENU = "//a[text()='%s']";
	
	public TopMenuComponent clickMenuItem(MenuType menuType) {
		String xpath = String.format(MENU, menuType.getName());
		PageActionsHelper.waitAndClick(By.xpath(xpath));
		return this;
	}
	
	public TopMenuComponent clickSubMenuItem(SubMenuType subMenuType) {
		String xpath = String.format(SUB_MENU, subMenuType.getName());
		PageActionsHelper.waitAndClick(By.xpath(xpath));
		return this;
	}

}
