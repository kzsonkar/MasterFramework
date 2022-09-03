package com.karan.tests;

import java.util.function.BiPredicate;

import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.karan.fixtures.addusers.entity.UserData;
import com.karan.pages.LoginPage;
import com.karan.pages.pagecomponents.adduserspage.AddUsersComponent;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;

public class AddUsersTest extends WebBase {

	@Test(dataProvider = "getData")
	public void testAddusers(UserData userData, BiPredicate<UserData, AddUsersComponent> predicate)
			throws InterruptedException {
		// test
		boolean isMessageDisplayed = new LoginPage().loginToApplication("Admin", "admin123")
				.navigateToAddUsersPage().getAddUsersComponent().fillDetails(userData, predicate);
		Assertions.assertThat(isMessageDisplayed).withFailMessage(() -> "Success message is not displayed!")
				.isTrue();
		Thread.sleep(5000);
	}

	@DataProvider
	public Object[][] getData() {
		FixtureFactoryLoader.loadTemplates("com.karan.fixtures");
		BiPredicate<UserData, AddUsersComponent> justEmployeeNamePredicate = (userData, addUserComponent) -> {
			addUserComponent.setEmpNameTextBox(userData.getEmployeeName());
			return addUserComponent.isErrorDisplayedForEmployeeName();
		};
		// UserData valid = Fixture.from(UserData.class).gimme("valid");
		UserData justEmployeeName = Fixture.from(UserData.class).gimme("just_employeename");
		return new Object[][] { { justEmployeeName, justEmployeeNamePredicate } };
	}
}
