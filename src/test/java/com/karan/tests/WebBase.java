package com.karan.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.karan.driver.Driver;

public class WebBase {
	
	@BeforeMethod
	public void setUp() {
		Driver.initDriverForWeb();
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quitDriver();
	}

}
