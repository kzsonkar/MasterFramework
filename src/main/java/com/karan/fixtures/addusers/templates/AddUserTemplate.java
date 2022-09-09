/**
 * 
 */
package com.karan.fixtures.addusers.templates;

import com.karan.fixtures.addusers.entity.UserData;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

/**
 * @author karansonkar
 *
 */
public class AddUserTemplate implements TemplateLoader {

	@Override
	public void load() {
		Fixture.of(UserData.class).addTemplate("valid", new Rule() {
			{
				add("userRole", random("ESS", "Admin"));
				add("employeeName", uniqueRandom("Aaliya Haq", "Admin A"));
				add("userName", random("abcdef1234"));
				add("status", random("Enabled", "Disabled"));
				add("password", random("Password@123"));
				add("message","Success message is not displayed");
			}
		});

		Fixture.of(UserData.class).addTemplate("just_employeename", new Rule() {
			{
				add("employeeName", random("abcedf1234"));
				add("message","Error message is not displayed");
			}
		});

	}

}
