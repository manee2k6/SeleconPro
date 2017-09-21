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

public class RadioButtonX extends BaseClass1{
	@Test(dataProvider="oneBrowser")
	  public void radioBtn(String browser, String version, String os, Method method) throws IOException {
		//create webdriver session
	      this.createDriver(browser, version, os, method.getName());
	      WebDriver driver = this.getWebDriver();
	      
	      //Open Radio button URL of echoecho website..
	      driver.get(PropFileHandler.fetchProp(AutoConstants.Url.RURL));
	      
	      //collect list of radio button from the group1.
	      List<WebElement> radioList = driver.findElements(By.xpath("//input[@name='group1']"));
	      System.out.println("No of RadioButtons:"+radioList.size());
	      
	      //show the current status
	      System.out.println(radioList.get(0).getAttribute("checked"));
	      System.out.println(radioList.get(1).getAttribute("checked"));
	      System.out.println(radioList.get(2).getAttribute("checked"));
	      //click the milk option on the radio button.
	      driver.findElement(By.xpath("//input[@value='Milk']")).click();
	      
	      //show the current status
	      System.out.println(radioList.get(0).getAttribute("checked"));
	      System.out.println(radioList.get(1).getAttribute("checked"));
	      System.out.println(radioList.get(2).getAttribute("checked"));
	      
	      
	  }
}
