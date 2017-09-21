package com.selencon.saucetest.homepage;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.UnexpectedException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.selecon.common.BaseClass1;
import com.selecon.utils.AutoConstants;
import com.selecon.utils.PropFileHandler;

public class AllLinks extends BaseClass1 {
	@Test(dataProvider="oneBrowser")
	  public void allLinks(String browser, String version, String os, Method method) throws IOException {
		//create webdriver session
	      this.createDriver(browser, version, os, method.getName());
	      WebDriver driver = this.getWebDriver();
	      
	      // Navigate to WebPage
	      driver.get(PropFileHandler.fetchProp(AutoConstants.Url.URL));
	      
	      //Collect all the link elements from webpage
	      List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	      System.out.println("No of links in this page:"+allLinks.size());
	      
	      int count = allLinks.size();
	      //Print all the links on console
	      for(int i=0; i<count;i++) {
	    	  System.out.println(allLinks.get(i).getAttribute("href"));
	      }
	      
	      
	     
	  }
}
