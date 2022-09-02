package com.karan.pages;

import com.karan.pages.pagecomponents.adduserspage.AddUsersComponent;
import com.karan.pages.pagecomponents.adduserspage.SearchComponent;

public class SystemUserPage {
	
	private final SearchComponent searchComponent;
	private final AddUsersComponent addUsersComponent;
	
	public SystemUserPage() {
		this.addUsersComponent = new AddUsersComponent();
		this.searchComponent = new SearchComponent();
	}
	
	public AddUsersComponent getAddUsersComponent() {
		return addUsersComponent;
	}

}
