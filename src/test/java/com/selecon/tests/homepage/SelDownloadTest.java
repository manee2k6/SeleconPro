package com.selecon.tests.homepage;

import java.io.IOException;

import org.testng.annotations.Test;

import com.selecon.common.BaseClass;
import com.selecon.pages.SelDownloadPage;
import com.selecon.pages.SelHomePage;
import com.selecon.utils.AutoConstants;
import com.selecon.utils.PropFileHandler;

public class SelDownloadTest extends BaseClass {
	SelHomePage objHomePage;
	SelDownloadPage objDownload;
	
  @Test
  public void downloadScenario() throws IOException {
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
