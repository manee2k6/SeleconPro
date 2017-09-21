package com.selecon.common;

import org.testng.annotations.Test;

import com.selecon.utils.AutoConstants;
import com.selecon.utils.PropFileHandler;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

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
		  System.setProperty(PropFileHandler.fetchProp(AutoConstants.BrowserKey.FIREFOX_KEY), System.getProperty("user.dir")+"\\src\\main\\resources\\Lib\\geckodriver.exe");
			  WebDriver driver = new FirefoxDriver();
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 
		 }else if(browser.equals("Chrome")){
	       System.setProperty(PropFileHandler.fetchProp(AutoConstants.BrowserKey.CHROME_KEY), System.getProperty("user.dir")+"\\src\\main\\resources\\Lib\\chomedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 }else if(browser.equals("IE")){
			 System.setProperty(PropFileHandler.fetchProp(AutoConstants.BrowserKey.IE_KEY), System.getProperty("user.dir")+"\\src\\main\\resources\\Lib\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 }else{
			 System.out.println("Browser Mismatch..exited..");
		 }
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
