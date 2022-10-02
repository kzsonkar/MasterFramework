package com.karan.tests;

//import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.karan.pages.LoginPage;
import com.karan.predicatefactory.enums.AddUsersScenarioType;

import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;

public class AddUsersTest extends WebBase {

	@Test(dataProvider = "getData")
	public void testAddusers(AddUsersScenarioType addUsersScenarioType) throws InterruptedException {
		// test
		boolean isMessageDisplayed = new LoginPage().loginToApplication("Admin", "admin123").navigateToAddUsersPage()
				.getAddUsersComponent()
				.fillDetails(addUsersScenarioType.getUserData(), addUsersScenarioType.getPredicate());
		Assertions.assertThat(isMessageDisplayed).withFailMessage(()->addUsersScenarioType.getUserData().getMessage())
				.isTrue();
		Thread.sleep(5000);
	}

	@DataProvider(parallel = false)
	public Object[] getData() {
		FixtureFactoryLoader.loadTemplates("com.karan.fixtures");
		return new Object[] {AddUsersScenarioType.VALID, AddUsersScenarioType.JUST_EMPLOYEE_NAME};
		//return Stream.of(AddUsersScenarioType.values());
	}
}
