package com.selencon.saucetest.homepage;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.UnexpectedException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.selecon.common.BaseClass1;
import com.selecon.utils.AutoConstants;
import com.selecon.utils.PropFileHandler;

public class CheckBox extends BaseClass1 {
	@Test(dataProvider="oneBrowser")
	  public void checkBox(String browser, String version, String os, Method method) throws IOException {
		//create webdriver session
	      this.createDriver(browser, version, os, method.getName());
	      WebDriver driver = this.getWebDriver();
	      
	      //Navigae to the webpage--> Echo Echo webpage to handle checkbox
	      driver.get(PropFileHandler.fetchProp(AutoConstants.Url.CURL));
	      
	      //Select the checkbox with the options provided
	      driver.findElement(By.name("option2")).click(); // this unselects Butter checkbox from page
	      
	      driver.findElement(By.name("option1")).click();
	      
	      
	  }
}
