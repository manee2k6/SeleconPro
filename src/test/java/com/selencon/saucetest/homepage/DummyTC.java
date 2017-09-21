package com.selencon.saucetest.homepage;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.UnexpectedException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.selecon.common.BaseClass1;

public class DummyTC extends BaseClass1 {
  @Test(dataProvider="oneBrowser")
  public void test(String browser, String version, String os, Method method) throws UnexpectedException, MalformedURLException {
	//create webdriver session
      this.createDriver(browser, version, os, method.getName());
      WebDriver driver = this.getWebDriver();
  }
}
