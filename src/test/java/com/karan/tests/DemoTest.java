package com.karan.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.karan.config.factory.ConfigFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {
  @Test
  public void f() {
	  System.out.println(ConfigFactory.getConfig().browser());
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://google.com");
	  driver.close();
	  driver.quit();
  }
}
