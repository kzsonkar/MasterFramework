package com.karan.tests;


import org.testng.annotations.Test;

import com.karan.driver.Driver;


public class DemoTest {
  @Test
  public void f() {
	  Driver.initDriverForWeb();
  }
}
