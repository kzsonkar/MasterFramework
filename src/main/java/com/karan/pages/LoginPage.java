/**
 * 
 */
package com.karan.pages;

import org.openqa.selenium.By;

import com.karan.utils.PageActionsHelper;

/**
 * @author karansonkar
 *
 */
public class LoginPage {

	private static final By USER_NAME_TEXT_BOX = By.id("txtUsername");
	private static final By PASSWORD_TEXT_BOX = By.id("txtPassword");
	private static final By LOGIN_BUTTON = By.id("btnLogin");

	private LoginPage setUserNameTextBox(String userName) {
		PageActionsHelper.waitAndSendKeys(USER_NAME_TEXT_BOX, userName);
		return this;
	}

	private LoginPage setPasswordTextBox(String password) {
		PageActionsHelper.waitAndSendKeys(PASSWORD_TEXT_BOX, password);
		return this;
	}

	private HomePage setLoginButton() {
		PageActionsHelper.waitAndClick(LOGIN_BUTTON);
		return new HomePage();
	}

	public HomePage loginToApplication(String userName, String password) {
		return setUserNameTextBox(userName).setPasswordTextBox(password).setLoginButton();
	}

}
