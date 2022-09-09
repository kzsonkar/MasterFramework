/**
 * 
 */
package com.karan.predicatefactory.enums;

import java.util.function.BiPredicate;

import com.karan.fixtures.addusers.entity.UserData;
import com.karan.pages.pagecomponents.adduserspage.AddUsersComponent;
import com.karan.predicatefactory.AddUsersPredicateFactory;

import br.com.six2six.fixturefactory.Fixture;
import lombok.Getter;

/**
 * @author karansonkar
 *
 */
@Getter
public enum AddUsersScenarioType {

	VALID(AddUsersPredicateFactory.getPredicate("valid"), Fixture.from(UserData.class).gimme("valid")),
	JUST_EMPLOYEE_NAME(AddUsersPredicateFactory.getPredicate("just_employeename"),
			Fixture.from(UserData.class).gimme("just_employeename"));

	private final BiPredicate<UserData, AddUsersComponent> predicate;
	private final UserData userData;

	AddUsersScenarioType(BiPredicate<UserData, AddUsersComponent> predicate, UserData userData) {
		this.predicate = predicate;
		this.userData = userData;

	}

}
