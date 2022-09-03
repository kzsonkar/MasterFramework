package com.karan.tests;

import java.util.stream.Stream;

import org.testng.annotations.Test;

import com.karan.fixtures.addusers.entity.UserData;
import com.karan.pages.LoginPage;

import io.github.sskorol.core.DataSupplier;

public class AddUsersTest extends WebBase {
	@Test(dataProvider = "getData")
	public void testAddusers(UserData userData) throws InterruptedException {
		// test
		new LoginPage().loginToApplication("Admin", "admin123").navigateToAddUsersPage().getAddUsersComponent().fillDetails(userData);
		Thread.sleep(5000);
	}
	
	@DataSupplier
	public Stream<UserData> getData(){ 
		UserData userData = new UserData("Admin", "empName","userName","Enabled","password");
		return Stream.of(userData);
	}
}
