package com.karan.tests;


import org.testng.annotations.Test;

import com.karan.config.factory.BrowserStackConfigFactory;


public class DemoTest {
  @Test
  public void f() {
	  System.out.println(BrowserStackConfigFactory.getConfig().browserStackURL());
  }
}
