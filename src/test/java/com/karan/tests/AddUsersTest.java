package com.karan.tests;

import org.testng.annotations.Test;

import com.karan.pages.LoginPage;

public class AddUsersTest extends WebBase {
	@Test
	public void testAddusers() {
		// test
		new LoginPage()
		.loginToApplication("", "")
		.navigateToAddUsersPage()
		.getAddUsersComponent()
		.setAddButton();
	}
}
