package com.selecon.testng;

import org.testng.annotations.Test;

import com.selecon.utils.AutoConstants;
import com.selecon.utils.PropFileHandler;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;

public class BaseClass {
  public static WebDriver driver; // Global static variable	
  
  @Parameters("browser")	
  @BeforeClass()
  public void beforeClass(String browser) throws IOException {
	  if(browser.equals("Firefox")){
		  System.setProperty(PropFileHandler.fetchProp(AutoConstants.BrowserKey.FIREFOX_KEY), System.getProperty("user.dir")+"\\Lib\\geckodriver.exe");
		  driver = new FirefoxDriver();
			 
		 }else if(browser.equals("Chrome")){
	       System.setProperty(PropFileHandler.fetchProp(AutoConstants.BrowserKey.CHROME_KEY), System.getProperty("user.dir")+"\\Lib\\chomedriver.exe");
			 driver = new ChromeDriver();
			 
		 }else if(browser.equals("IE")){
			 System.setProperty(PropFileHandler.fetchProp(AutoConstants.BrowserKey.IE_KEY), System.getProperty("user.dir")+"\\Lib\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
			 
		 }else{
			 System.out.println("Browser Mismatch..exited..");
		 }
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
