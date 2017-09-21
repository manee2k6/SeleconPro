package com.selencon.saucetest.homepage;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.UnexpectedException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.selecon.common.BaseClass1;
import com.selecon.utils.PropFileHandler;

public class SeleniumMethods extends BaseClass1 {
	@Test(dataProvider="oneBrowser")
	  public void selMethods(String browser, String version, String os, Method method) throws IOException {
		//create webdriver session
	      this.createDriver(browser, version, os, method.getName());
	      WebDriver driver = this.getWebDriver();
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      driver.get(PropFileHandler.fetchProp("URLs"));
	      System.out.println("CurrentURL"+driver.getCurrentUrl());
	      System.out.println("Page Title:"+driver.getTitle());
	      System.out.println(driver.getPageSource());
	      
	  }
}
