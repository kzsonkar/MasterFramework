/**
 * 
 */
package com.karan.pages.pagecomponents.adduserspage;

import org.openqa.selenium.By;

import com.karan.utils.PageActionsHelper;

/**
 * @author karansonkar
 *
 */
public class AddUsersComponent {
	
	 private static final By ADD_BUTTON = By.id("btnAdd");

	public AddUsersComponent setAddButton() {
		PageActionsHelper.waitAndClick(ADD_BUTTON);
		return this;
	}
	 
	 

}
