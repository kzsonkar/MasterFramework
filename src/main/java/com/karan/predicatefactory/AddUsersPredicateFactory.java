/**
 * 
 */
package com.karan.predicatefactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

import com.karan.fixtures.addusers.entity.UserData;
import com.karan.pages.pagecomponents.adduserspage.AddUsersComponent;

/**
 * @author karansonkar
 *
 */
public class AddUsersPredicateFactory {

	private static final Map<String, Supplier<BiPredicate<UserData, AddUsersComponent>>> MAP = new HashMap<>();

	private static final BiPredicate<UserData, AddUsersComponent> VALID_PREDICATE = (userData, addUsersComponent) -> {
		addUsersComponent.setUserRoleDropDown(userData.getUserRole()).setEmpNameTextBox(userData.getEmployeeName())
				.setStatusDropDown(userData.getStatus()).setUserNameTextBox(userData.getUserName())
				.setPasswordTextBox(userData.getPassword()).setConfirmPasswordTextBox(userData.getPassword());
		return addUsersComponent.isSuccessMessageDisplayed();
	};

	private static final BiPredicate<UserData, AddUsersComponent> JUST_EMP_NAME_PREDICATE = (userData,
			addUsersComponent) -> {
		addUsersComponent.setEmpNameTextBox(userData.getEmployeeName());
		return addUsersComponent.isErrorDisplayedForEmployeeName();
	};

	static {
		MAP.put("valid", () -> VALID_PREDICATE);
		MAP.put("just_employeename", () -> JUST_EMP_NAME_PREDICATE);
	}
	
	public static BiPredicate<UserData, AddUsersComponent> getPredicate(String value){
		return MAP.get(value).get();
	}

}
