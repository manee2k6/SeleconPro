package com.selecon.testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.selecon.utils.AutoConstants;
import com.selecon.utils.PropFileHandler;

public class BrowserTest extends BaseClass {
  @Test
  public void google() throws IOException {
	  
	  //Open the browser and navigate to Google
	  driver.get(PropFileHandler.fetchProp(AutoConstants.Url.URL));
	  //Click SignIn link in the GooglePage
	  driver.findElement(By.xpath("//a[@id='gb_70']")).click();
	  // select another account from login page
	  driver.findElement(By.xpath("//div[@id='identifierLink']/div[2]/p"));
	  
	  
  }
  
 }
