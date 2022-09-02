/**
 * 
 */
package com.karan.pages.pagecomponents.adduserspage;

import org.openqa.selenium.By;

import com.karan.fixtures.addusers.entity.UserData;
import com.karan.utils.PageActionsHelper;

/**
 * @author karansonkar
 *
 */
public class AddUsersComponent {

	private static final By USER_ROLE_DROP_DOWN = By.xpath("//div[@role='option']//span");
	private static final By STATUS_DROP_DOWN = By.xpath("//div[@role='option']//span");
	private static final By EMP_NAME_TEXT_BOX = By
			.xpath("//label[text()='Employee Name']/parent::div//following-sibling::div//input");
	private static final By USER_NAME_TEXT_BOX = By
			.xpath("//label[text()='Username']/parent::div//following-sibling::div//input");
	private static final By PASSWORD_TEXT_BOX = By
			.xpath("//label[text()='Password']/parent::div//following-sibling::div//input");
	private static final By CONFIRM_PASSWORD_TEXT_BOX = By
			.xpath("//label[text()='Confirm Password']/parent::div//following-sibling::div//input");

	public AddUsersComponent setUserRoleDropDown(String option) {
		PageActionsHelper.select(USER_ROLE_DROP_DOWN, option);
		return this;
	}

	public AddUsersComponent setStatusDropDown(String option) {
		PageActionsHelper.select(STATUS_DROP_DOWN, option);
		return this;
	}

	public AddUsersComponent setEmpNameTextBox(String empName) {
		PageActionsHelper.waitAndSendKeys(EMP_NAME_TEXT_BOX, empName);
		return this;
	}

	public AddUsersComponent setUserNameTextBox(String userName) {
		PageActionsHelper.waitAndSendKeys(USER_NAME_TEXT_BOX, userName);
		return this;
	}

	public AddUsersComponent setPasswordTextBox(String password) {
		PageActionsHelper.waitAndSendKeys(PASSWORD_TEXT_BOX, password);
		return this;
	}

	public AddUsersComponent setConfirmPasswordTextBox(String confirmPassword) {
		PageActionsHelper.waitAndSendKeys(CONFIRM_PASSWORD_TEXT_BOX, confirmPassword);
		return this;
	}
	
	public void fillDetails(UserData userData){
		setUserRoleDropDown(userData.getUserRole())
		.setEmpNameTextBox(userData.getEmployeeName())
		.setStatusDropDown(userData.getStatus())
		.setUserNameTextBox(userData.getUserName())
		.setPasswordTextBox(userData.getPassword())
		.setConfirmPasswordTextBox(userData.getPassword());
	}

}
