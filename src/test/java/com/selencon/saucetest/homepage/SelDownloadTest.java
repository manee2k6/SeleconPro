package com.selencon.saucetest.homepage;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.selecon.common.BaseClass;
import com.selecon.common.BaseClass1;
import com.selecon.pages.SelDownloadPage;
import com.selecon.pages.SelHomePage;
import com.selecon.utils.AutoConstants;
import com.selecon.utils.PropFileHandler;

public class SelDownloadTest extends BaseClass1 {
	SelHomePage objHomePage;
	SelDownloadPage objDownload;
	
  @Test(dataProvider="oneBrowser")
  public void downloadScenario(String browser, String version, String os, Method method) throws IOException {
	 
	//create webdriver session
      this.createDriver(browser, version, os, method.getName());
      WebDriver driver = this.getWebDriver();
      
	  objHomePage = new SelHomePage(driver);
	  objDownload = new SelDownloadPage(driver);
	//Navigate to Selenium home page URL
	  objHomePage.openURL(PropFileHandler.fetchProp(AutoConstants.Url.SELENIUM_URL));
	  
	  //Go to search box at the top and type Bahubali and click GO
	  objHomePage.searchSelenium("bahubali");
	  
	  //Returning back to selenium homepage..
	  objHomePage.returnBackURL();
	  
	  //Navigate to Download page
	  objHomePage.clickDownloadTab();
	  //objDownload.openDownloadPageURL();
	  
	  //Get the page title of downloads
	  System.out.println(objDownload.getPageTile());
	  
	  //Handle previous release version link
	  objDownload.clickPrevRelease();
	  
	//Returning back to selenium homepage..
	  objHomePage.returnBackURL();
	  
  }
}
