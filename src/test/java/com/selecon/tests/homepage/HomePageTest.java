package com.selecon.tests.homepage;

import java.io.IOException;

import org.testng.annotations.Test;

import com.selecon.common.BaseClass;
import com.selecon.pages.SelHomePage;
import com.selecon.utils.AutoConstants;
import com.selecon.utils.PropFileHandler;

public class HomePageTest extends BaseClass {
	 SelHomePage objHomePage;	
	
  @Test
  public void selHomeTabTests() throws IOException {
	 
	  objHomePage = new SelHomePage(driver);
	  //Navigate to Selenium home page URL
	  objHomePage.openURL(PropFileHandler.fetchProp(AutoConstants.Url.SELENIUM_URL));
	  
	  //Go to search box at the top and type Bahubali and click GO
	  objHomePage.searchSelenium("bahubali");
	  
	  //return back to homepage url
	  objHomePage.returnBackURL();
  }
}
