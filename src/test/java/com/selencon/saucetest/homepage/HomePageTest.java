package com.selencon.saucetest.homepage;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.selecon.common.BaseClass;
import com.selecon.common.BaseClass1;
import com.selecon.pages.SelHomePage;
import com.selecon.utils.AutoConstants;
import com.selecon.utils.PropFileHandler;

public class HomePageTest extends BaseClass1 {
	 SelHomePage objHomePage;	
	
  @Test(dataProvider="oneBrowser")
  public void selHomeTabTests(String browser, String version, String os, Method method) throws IOException {
	  
	//create webdriver session
      this.createDriver(browser, version, os, method.getName());
      WebDriver driver = this.getWebDriver();
	 
	  objHomePage = new SelHomePage(driver);
	  //Navigate to Selenium home page URL
	  objHomePage.openURL(PropFileHandler.fetchProp(AutoConstants.Url.SELENIUM_URL));
	  
	  //Go to search box at the top and type Bahubali and click GO
	  objHomePage.searchSelenium("bahubali");
	  
	  //return back to homepage url
	  objHomePage.returnBackURL();
  }
}
